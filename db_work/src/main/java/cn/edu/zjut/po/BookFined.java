package cn.edu.zjut.po;

import java.sql.Date;

public class BookFined {
    long id;
    String reader_account;
    java.sql.Date fined_time;
    float fined_amount;
    long finished;
    java.sql.Date finished_time;
    String book_id;
    String operator;
    public BookFined(){}

    @Override
    public String toString() {
        return "BookFined{" +
                "id=" + id +
                ", reader_account='" + reader_account + '\'' +
                ", fined_time=" + fined_time +
                ", fined_amount=" + fined_amount +
                ", finished=" + finished +
                ", finished_time=" + finished_time +
                ", book_id='" + book_id + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }

    public BookFined(long id, String reader_account, Date fined_time, float fined_amount, long finished, Date finished_time, String book_id, String operator) {
        this.id = id;
        this.reader_account = reader_account;
        this.fined_time = fined_time;
        this.fined_amount = fined_amount;
        this.finished = finished;
        this.finished_time = finished_time;
        this.book_id = book_id;
        this.operator = operator;
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

    public Date getFined_time() {
        return fined_time;
    }

    public void setFined_time(Date fined_time) {
        this.fined_time = fined_time;
    }

    public float getFined_amount() {
        return fined_amount;
    }

    public void setFined_amount(float fined_amount) {
        this.fined_amount = fined_amount;
    }

    public long getFinished() {
        return finished;
    }

    public void setFinished(long finished) {
        this.finished = finished;
    }

    public Date getFinished_time() {
        return finished_time;
    }

    public void setFinished_time(Date finished_time) {
        this.finished_time = finished_time;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
