package cn.edu.zjut.service;

import cn.edu.zjut.po.*;

import java.util.List;

public interface IManagerService {

   
    void updateReader(Reader reader);
    //查询征订记录
    List<BookSubscription> querySubscription();
    //查询所有detail
    List<ReaderInfoDetail> selectAllReader();
    //添加读者信息
    void addReader(Reader reader);
    //删读者全部信息
    void deleteReader(String reader_account);
    //管理员登录
    List<ManagerAccount> login(String account,String password);
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
    //查询所有罚款记录
    List<BookFined> selectAllFined();
    //查询某人的罚款记录
    List<BookFined> selectFined(String reader_account);
    //增加一条罚款记录
    void insert(BookFined bookFined);
    //缴纳罚款
    void delete(long id,java.sql.Date finished_time);
    //图书征订
    void insertBookSubscription(BookSubscription bookSubscription);
    //查询可购的图书列表
    List<BookList> selectBookList();
    //还书后书库状态置1
    void returnBookInfo(String book_id);
    //读者所持书减1
    void returnBook(String reader_account);
    //借书记录还书
    void returnBRRecord(long id,java.sql.Date return_time,String in_operator);
    //查询所有借书记录
    public List<BRRecord> selectAllRecord();
    //查询某人的借书记录
    public List<BRRecord> selectRecord(String account);
    //查询某条借书记录
    public BRRecord selectRecordById(int id);
    //查询所有违规记录
    public List<Violation> selectAllViolation();
    //查询某个人违规记录
    public List<Violation> selectViolation(String reader_account);
    //查询丢失或损坏的书
    List<BookLostDamage> selectBookLostDamage();
    //丢失或损坏一本书
    void insertBookLostDamage(BookLostDamage bookLostDamage);
    //注销一本书
    void insertBookCanceled(BookCanceled bookCanceled);
    //查询注销的书
    List<BookCanceled> queryBookCanceled();
    List<ReaderInfo> selectAllReaderInfo();
    List<Reader> queryAllReader();
    //增加一条罚款记录
    void addfined(BookFined bookFined);
}
