package cn.edu.zjut.service;

import cn.edu.zjut.po.*;

import java.util.List;

public interface IReaderService {
    //缴纳罚款
    void finishfined(int id,java.sql.Date time);
    //增加一条BRRecord记录
    void borrowBRecord(BRRecord brRecord);
    //借出书后书库状态置0
    void borrowBookInfo(String id);
    //读者所持书加1
    void borrowBook(String reader_account);
    //查询所有图书信息
    List<BookInfo> selectAllBook();
    //查询某本书的信息
    List<BookInfo> selectBook(String name);
    //续借
    void renewBook(long id,java.sql.Date deadline);
    //查询某人的罚款记录
    List<BookFined> selectFined(String reader_account);
    //缴纳罚款
    void delete(long id,java.sql.Date finished_time);
    //查询某人的借书记录
    public List<BRRecord> selectRecord(String account);
    //还书后书库状态置1
    void returnBookInfo(String book_id);
    //读者所持书减1
    void returnBook(String reader_account);
    //借书记录还书
    void returnBRRecord(long id,java.sql.Date return_time,String in_operator);
    //查询某个人违规记录
    public List<Violation> selectViolation(String reader_account);
    //读者登录
    ReaderAccount login(String account, String password);
    //查询某个读者信息
    ReaderInfo selectReaderInfo(String reader_account);
    //查询某个读者详细信息
    ReaderInfoDetail selectReaderInfoDetail(String reader_account);
    //更新某个读者的信息(电话与地址)
    void updateReaderInfoDetail(String account,String phone,String address);
}
