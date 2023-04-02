package com.tienda.dami.TiendaDami.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Objects;

@Entity
@Table
public class Pay {

    @Id
    @Column
    private Long id;

    @Column(name = "nombre_pago")
    private String name;

    @Column(name = "tipo_pago")
    private String paymentType;

    @Column(name = "numero_pago")
    private String payNumber;

    @Column(name = "total_pago")
    private Double totalPayment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pay pay = (Pay) o;
        return Objects.equals(id, pay.id) && Objects.equals(name, pay.name) && Objects.equals(paymentType, pay.paymentType) && Objects.equals(payNumber, pay.payNumber) && Objects.equals(totalPayment, pay.totalPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, paymentType, payNumber, totalPayment);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
