package com.tienda.dami.TiendaDami.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Objects;

@Entity
@Table(name = "buyers")
public class Buyer {

    @Id
    @Column
    private Long id;

    @Column(name = "numero_compra")
    private Long number;

    @Column(name = "metodo_pago")
    private String paymentMethod;

    @Column(name = "cantidad")
    private Long amount;

    @Column(name = "valor")
    private Double value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(id, buyer.id) && Objects.equals(number, buyer.number) && Objects.equals(paymentMethod, buyer.paymentMethod) && Objects.equals(amount, buyer.amount) && Objects.equals(value, buyer.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, paymentMethod, amount, value);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
