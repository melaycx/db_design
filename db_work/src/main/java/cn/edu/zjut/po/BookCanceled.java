package cn.edu.zjut.po;

import java.sql.Date;

public class BookCanceled {
    long id;
    String book_id;
    java.sql.Date canceled_time;
    public BookCanceled(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public Date getCanceled_time() {
        return canceled_time;
    }

    public void setCanceled_time(Date canceled_time) {
        this.canceled_time = canceled_time;
    }
}
