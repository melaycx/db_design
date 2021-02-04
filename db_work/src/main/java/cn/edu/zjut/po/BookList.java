package cn.edu.zjut.po;

public class BookList {
    String isbn;
    String publisher;
    float unit_price;
    String name;
    String version;
    String author;
    String type;

    @Override
    public String toString() {
        return "BookList{" +
                "isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", unit_price=" + unit_price +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public BookList(){}

    public BookList(String isbn, String publisher, float unit_price, String name, String version, String author, String type) {
        this.isbn = isbn;
        this.publisher = publisher;
        this.unit_price = unit_price;
        this.name = name;
        this.version = version;
        this.author = author;
        this.type = type;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
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
}
