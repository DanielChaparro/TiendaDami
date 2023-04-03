package com.tienda.dami.TiendaDami.model;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pays")
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

    @ManyToMany
    private List<Product> products;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pay pay = (Pay) o;
        return Objects.equals(id, pay.id) && Objects.equals(name, pay.name) && Objects.equals(paymentType, pay.paymentType) && Objects.equals(payNumber, pay.payNumber) && Objects.equals(totalPayment, pay.totalPayment) && Objects.equals(products, pay.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, paymentType, payNumber, totalPayment, products);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
