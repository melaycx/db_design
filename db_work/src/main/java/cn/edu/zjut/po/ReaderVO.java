package cn.edu.zjut.po;

import java.util.List;

public class ReaderVO {
    String code;
    String msg;
    int count;
    List<Reader> data;
    public ReaderVO(){}

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

    public List<Reader> getData() {
        return data;
    }

    public void setData(List<Reader> data) {
        this.data = data;
    }
}
