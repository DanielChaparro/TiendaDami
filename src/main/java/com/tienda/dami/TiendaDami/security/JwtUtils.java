package com.tienda.dami.TiendaDami.security;

import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


import java.util.Date;
import java.util.List;
import java.util.function.Function;

@Component
public class JwtUtils {

    Logger log = LoggerFactory.getLogger(JwtUtils.class);
    @Value("{jwt.secret}")
    private String secret;
    @Value("{jwt.expiration}")
    private String jwtExpiration;

    public String extractUserName(String token){
        return extractClaim(token, Claims::getSubject);
    }

    public Claims extractAllClaims(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    public Date extractExpiration(String token){
        return extractClaim(token, Claims::getExpiration);
    }

    public Boolean validateToken(String token, UserDetails userDetails){
        final String userName = extractUserName(token);
        return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    public Boolean isTokenExpired(String token){
        return  extractExpiration(token).before(new Date());
    }

    public String generateToken(String userName, List<String> roles){
        return Jwts.builder().setSubject(userName).claim("role",roles)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(jwtExpiration)))
                .signWith(SignatureAlgorithm.HS256, secret).compact();
    }

    public Boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
        }catch (SignatureException e){
            log.info("Invalid JWT signature");
        }catch (MalformedJwtException e){
            log.info("Invalid JWT Token");
        }catch (ExpiredJwtException e){
            log.info("Expired JWT Token");
        }catch (UnsupportedJwtException e){
            log.info("Unsupported JWT Token");
        }catch (IllegalArgumentException e){
            log.info("JWT Token error");
        }
        return false;
    }

    public String getToken(HttpServletRequest httpServletRequest){
        final String bearerToken = httpServletRequest.getHeader("Authorization");
        if(StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")){
            return bearerToken.substring(7, bearerToken.length());
        }
        return null;
    }

}
