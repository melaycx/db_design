package cn.edu.zjut.po;

import java.util.List;

public class BookFinedVO {
    String code;
    String msg;
    int count;
    List<BookFined> data;
    public BookFinedVO(){}

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

    public List<BookFined> getData() {
        return data;
    }

    public void setData(List<BookFined> data) {
        this.data = data;
    }
}
