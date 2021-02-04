package cn.edu.zjut.po;

public class ReaderInfoDetail {
    long id;
    String name;
    int sex;
    String phone;
    String reader_account;
    String address;
    String idcard;

    public ReaderInfoDetail(long id, String name, int sex, String phone, String reader_account, String address, String idcard) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.reader_account = reader_account;
        this.address = address;
        this.idcard = idcard;
    }

    public ReaderInfoDetail(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getReader_account() {
        return reader_account;
    }

    public void setReader_account(String reader_account) {
        this.reader_account = reader_account;
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

    @Override
    public String toString() {
        return "ReaderInfoDetail{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", reader_account='" + reader_account + '\'' +
                ", address='" + address + '\'' +
                ", idcard='" + idcard + '\'' +
                '}';
    }
}
