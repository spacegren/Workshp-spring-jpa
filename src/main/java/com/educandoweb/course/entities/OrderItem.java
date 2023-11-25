package com.educandoweb.course.entities;

import com.educandoweb.course.entities.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.function.DoublePredicate;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1l;

    @EmbeddedId
    private OrderItemPK idpk;
    private Integer quantity;
    private Double price;

    public OrderItem(){

    }
    public OrderItem(Order order , Product product ,Integer quantity , Double price){
        super();
        idpk.setOrder(order);
        idpk.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }
    public Order getOrder(){
        return idpk.getOrder();
    }
    public void setOrder(Order order){
        idpk.setOrder(order);
    }

    public Product getProduct(){
        return idpk.getProduct();
    }
    public void setProduct(Product product){
        idpk.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(idpk, orderItem.idpk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpk);
    }
}
