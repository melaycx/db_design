package cn.edu.zjut.po;

import java.sql.Date;

public class BookInfo {
    String name;
    String version;
    String author;
    String type;
    String publisher;
    float price;
    String id;
    String isbn;
    Date entry_time;
    long out_or_in;

    @Override
    public String toString() {
        return "BookInfo{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", isbn='" + isbn + '\'' +
                ", entry_time=" + entry_time +
                ", out_or_in=" + out_or_in +
                '}';
    }

    public BookInfo() {
    }

    public BookInfo(String name, String version, String author, String type, String publisher, float price, String id, String isbn, Date entry_time, long out_or_in) {
        this.name = name;
        this.version = version;
        this.author = author;
        this.type = type;
        this.publisher = publisher;
        this.price = price;
        this.id = id;
        this.isbn = isbn;
        this.entry_time = entry_time;
        this.out_or_in = out_or_in;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public long getOut_or_in() {
        return out_or_in;
    }

    public void setOut_or_in(long out_or_in) {
        this.out_or_in= out_or_in;
    }
}
