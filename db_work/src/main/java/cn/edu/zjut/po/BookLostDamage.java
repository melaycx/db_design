package cn.edu.zjut.po;

import java.sql.Date;

public class BookLostDamage {
    long id;
    String reader_account;
    java.sql.Date report_time;
    long type;
    String book_id;
    public BookLostDamage(){}

    @Override
    public String toString() {
        return "BookLostDamage{" +
                "id=" + id +
                ", reader_account='" + reader_account + '\'' +
                ", report_time=" + report_time +
                ", type=" + type +
                ", book_id='" + book_id + '\'' +
                '}';
    }

    public BookLostDamage(long id, String reader_account, Date report_time, long type, String book_id) {
        this.id = id;
        this.reader_account = reader_account;
        this.report_time = report_time;
        this.type = type;
        this.book_id = book_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReader_account() {
        return reader_account;
    }

    public void setReader_account(String reader_account) {
        this.reader_account = reader_account;
    }

    public Date getReport_time() {
        return report_time;
    }

    public void setReport_time(Date report_time) {
        this.report_time = report_time;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }
}
