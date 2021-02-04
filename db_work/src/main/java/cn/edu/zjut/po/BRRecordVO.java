package cn.edu.zjut.po;

import java.util.List;

public class BRRecordVO {
    String code;
    String msg;
    int count;
    List<BRRecord> data;
    public BRRecordVO(){}

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

    public List<BRRecord> getData() {
        return data;
    }

    public void setData(List<BRRecord> data) {
        this.data = data;
    }
}
