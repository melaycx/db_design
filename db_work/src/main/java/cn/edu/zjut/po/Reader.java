package cn.edu.zjut.po;

public class Reader {
    String account;
    String password;
    int book_borrow_max;
    int renew_max;
    int time_available;
    int kept_book;
    int violation;
    String name;
    int sex;
    String phone;
    String address;
    String idcard;

    public Reader(String account, String password, int book_borrow_max, int renew_max, int time_available, int kept_book, int violation, String name, int sex, String phone, String address, String idcard) {
        this.account = account;
        this.password = password;
        this.book_borrow_max = book_borrow_max;
        this.renew_max = renew_max;
        this.time_available = time_available;
        this.kept_book = kept_book;
        this.violation = violation;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.idcard = idcard;
    }

    public Reader(){}

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBook_borrow_max() {
        return book_borrow_max;
    }

    public void setBook_borrow_max(int book_borrow_max) {
        this.book_borrow_max = book_borrow_max;
    }

    public int getRenew_max() {
        return renew_max;
    }

    public void setRenew_max(int renew_max) {
        this.renew_max = renew_max;
    }

    public int getTime_available() {
        return time_available;
    }

    public void setTime_available(int time_available) {
        this.time_available = time_available;
    }

    public int getKept_book() {
        return kept_book;
    }

    public void setKept_book(int kept_book) {
        this.kept_book = kept_book;
    }

    public int getViolation() {
        return violation;
    }

    public void setViolation(int violation) {
        this.violation = violation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
