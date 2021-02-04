package cn.edu.zjut.dao;

import cn.edu.zjut.po.BRRecord;

import java.util.List;

public interface IBRRecordDAO {
    List<BRRecord> selectAllRecord();
    List<BRRecord> selectRecord(String account);
    void returnBook(long id,java.sql.Date return_time,String in_operator);
    void renew(long id,java.sql.Date deadline);
    void borrowBook(BRRecord brRecord);

    BRRecord selectRecordById(int id);
}
