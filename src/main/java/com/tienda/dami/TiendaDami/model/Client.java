package com.tienda.dami.TiendaDami.model;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @Column
    private Long id;

    @Column
    private String nombre;

    @Column
    private String direccion;

    @Column
    private String celular;

    @OneToMany
    private List<Pay> pays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(nombre, client.nombre) && Objects.equals(direccion, client.direccion) && Objects.equals(celular, client.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion, celular);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
