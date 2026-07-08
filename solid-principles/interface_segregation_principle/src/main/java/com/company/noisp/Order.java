package com.company.noisp;

public class Order extends Entity {

    private String orderNumber;
    private Double total;

    public Order() {}

    public Order(Long id, String orderNumber, Double total) {
        super(id);
        this.orderNumber = orderNumber;
        this.total = total;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}