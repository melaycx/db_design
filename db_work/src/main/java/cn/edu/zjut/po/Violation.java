package cn.edu.zjut.po;


import java.sql.Date;

public class Violation {

  private long id;
  private String reader_account;
  private java.sql.Date borrowed_time;
  private java.sql.Date return_time;
  private long renew;
  private String book_id;
  private String out_operator;
  private java.sql.Date deadline;
  private long out_or_in;
  private String in_operator;

  public Violation(long id, String reader_account, Date borrowed_time, Date return_time, long renew, String book_id, String out_operator, Date deadline, long out_or_in, String in_operator) {
    this.id = id;
    this.reader_account = reader_account;
    this.borrowed_time = borrowed_time;
    this.return_time = return_time;
    this.renew = renew;
    this.book_id = book_id;
    this.out_operator = out_operator;
    this.deadline = deadline;
    this.out_or_in = out_or_in;
    this.in_operator = in_operator;
  }

  public Violation(){}

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

  public Date getBorrowed_time() {
    return borrowed_time;
  }

  public void setBorrowed_time(Date borrowed_time) {
    this.borrowed_time = borrowed_time;
  }

  public Date getReturn_time() {
    return return_time;
  }

  public void setReturn_time(Date return_time) {
    this.return_time = return_time;
  }

  public long getRenew() {
    return renew;
  }

  public void setRenew(long renew) {
    this.renew = renew;
  }

  public String getBook_id() {
    return book_id;
  }

  public void setBook_id(String book_id) {
    this.book_id = book_id;
  }

  public String getOut_operator() {
    return out_operator;
  }

  public void setOut_operator(String out_operator) {
    this.out_operator = out_operator;
  }

  public Date getDeadline() {
    return deadline;
  }

  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }

  public long getOut_or_in() {
    return out_or_in;
  }

  public void setOut_or_in(long out_or_in) {
    this.out_or_in = out_or_in;
  }

  public String getIn_operator() {
    return in_operator;
  }

  public void setIn_operator(String in_operator) {
    this.in_operator = in_operator;
  }

  @Override
  public String toString() {
    return "Violation{" +
            "id=" + id +
            ", reader_account='" + reader_account + '\'' +
            ", borrowed_time=" + borrowed_time +
            ", return_time=" + return_time +
            ", renew=" + renew +
            ", book_id='" + book_id + '\'' +
            ", out_operator='" + out_operator + '\'' +
            ", deadline=" + deadline +
            ", out_or_in=" + out_or_in +
            ", in_operator='" + in_operator + '\'' +
            '}';
  }
}
