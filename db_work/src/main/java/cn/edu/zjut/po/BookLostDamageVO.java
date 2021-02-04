package cn.edu.zjut.po;

import java.util.List;

public class BookLostDamageVO {
    String code;
    String msg;
    int count;
    List<BookLostDamage> data;
    public BookLostDamageVO(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<BookLostDamage> getData() {
        return data;
    }

    public void setData(List<BookLostDamage> data) {
        this.data = data;
    }
}
