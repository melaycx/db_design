package cn.edu.zjut.po;

import java.sql.Date;

public class BookSubscription {
    String isbn;
    long amount;
    java.sql.Date subscription_time;
    float unit_price;
    long id;
    String operator;

    @Override
    public String toString() {
        return "BookSubscription{" +
                "isbn='" + isbn + '\'' +
                ", amount=" + amount +
                ", subscription_time=" + subscription_time +
                ", unit_price=" + unit_price +
                ", id=" + id +
                ", operator='" + operator + '\'' +
                '}';
    }
    public BookSubscription(){}

    public BookSubscription(String isbn, long amount, Date subscription_time, float unit_price, long id, String operator) {
        this.isbn = isbn;
        this.amount = amount;
        this.subscription_time = subscription_time;
        this.unit_price = unit_price;
        this.id = id;
        this.operator = operator;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getSubscription_time() {
        return subscription_time;
    }

    public void setSubscription_time(Date subscription_time) {
        this.subscription_time = subscription_time;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
