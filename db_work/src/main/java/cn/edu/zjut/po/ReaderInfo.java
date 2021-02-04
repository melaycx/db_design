package cn.edu.zjut.po;

public class ReaderInfo {
    long id;
    int book_borrow_max;
    int renew_max;
    int time_available;
    String reader_account;
    int kept_book;
    int violation;

    public ReaderInfo(long id, int book_borrow_max, int renew_max, int time_available, String reader_account, int kept_book, int violation) {
        this.id = id;
        this.book_borrow_max = book_borrow_max;
        this.renew_max = renew_max;
        this.time_available = time_available;
        this.reader_account = reader_account;
        this.kept_book = kept_book;
        this.violation = violation;
    }

    public ReaderInfo(){}

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

    public String getReader_account() {
        return reader_account;
    }

    public void setReader_account(String reader_account) {
        this.reader_account = reader_account;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
