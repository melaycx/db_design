package cn.edu.zjut.service;

import cn.edu.zjut.dao.*;
import cn.edu.zjut.mapper.ManagerAccountMapper;
import cn.edu.zjut.mapper.ReaderInfoDetailMapper;
import cn.edu.zjut.mapper.ReaderMapper;
import cn.edu.zjut.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService implements IManagerService {
    IReaderInfoDetailDAO readerInfoDetailDAO;
    IReaderAccountDAO readerAccountDAO;
    IReaderInfoDAO readerInfoDAO;
    IViolationDAO violationDAO;
    IBRRecordDAO brRecordDAO;
    IBookInfoDAO bookInfoDAO;
    IBookListDAO bookListDAO;
    IBookCanceledDAO bookCanceledDAO;
    IBookLostDamageDAO bookLostDamageDAO;
    IBookSubscriptionDAO bookSubscriptionDAO;
    IBookFinedDAO bookFinedDAO;
    ManagerAccountMapper managerAccountMapper;
    ReaderMapper readerMapper;
    ReaderInfoDetailMapper readerInfoDetailMapper;
    @Autowired
    public void setReaderInfoDetailMapper(ReaderInfoDetailMapper readerInfoDetailMapper){this.readerInfoDetailMapper=readerInfoDetailMapper;}
    @Autowired
    public void setReaderMapper(ReaderMapper readerMapper){this.readerMapper=readerMapper;}
    @Autowired
    public void setManagerAccountMapper(ManagerAccountMapper managerAccountMapper){
        this.managerAccountMapper=managerAccountMapper;
    }
    @Autowired
    public void setBookFinedDAO(IBookFinedDAO bookFinedDAO){this.bookFinedDAO=bookFinedDAO;}
    @Autowired
    public void setBookSubscriptionDAO(IBookSubscriptionDAO bookSubscriptionDAO){
        this.bookSubscriptionDAO=bookSubscriptionDAO;
    }
    @Autowired
    public void setBookLostDamageDAO(IBookLostDamageDAO bookLostDamageDAO){
        this.bookLostDamageDAO=bookLostDamageDAO;
    }
    @Autowired
    public void setBookCanceledDAO(IBookCanceledDAO bookCanceledDAO){this.bookCanceledDAO=bookCanceledDAO;}
    @Autowired
    public void setBookListDAO(IBookListDAO bookListDAO){this.bookListDAO=bookListDAO;}
    @Autowired
    public void setReaderInfoDetailDAO(IReaderInfoDetailDAO readerInfoDetailDAO) {
        this.readerInfoDetailDAO = readerInfoDetailDAO;
    }

    @Autowired
    public void setReaderAccountDAO(IReaderAccountDAO readerAccountDAO) {
        this.readerAccountDAO = readerAccountDAO;
    }

    @Autowired
    public void setReaderInfoDAO(IReaderInfoDAO readerInfoDAO) {
        this.readerInfoDAO = readerInfoDAO;
    }

    @Autowired
    public void setViolationDAO(IViolationDAO violationDAO) {
        this.violationDAO = violationDAO;
    }

    @Autowired
    public void setBrRecordDAO(IBRRecordDAO brRecordDAO) {
        this.brRecordDAO = brRecordDAO;
    }

    @Autowired
    public void setBookInfoDAO(IBookInfoDAO bookInfoDAO) {
        this.bookInfoDAO = bookInfoDAO;
    }
    @Override
    public List<ReaderInfoDetail> selectAllReader() {
        return readerInfoDetailDAO.selectAllReader();
    }
    @Override
    public void addReader(Reader reader) {
        readerAccountDAO.addReaderAccount(reader);
        readerInfoDetailDAO.addReaderInfoDetail(reader);
        readerInfoDAO.addReaderInfo(reader);
    }
    @Override
    public void deleteReader(String reader_account) {
        readerInfoDAO.deleteReaderInfo(reader_account);
        readerInfoDetailDAO.deleteReaderInfoDetail(reader_account);
        readerAccountDAO.deleteReaderAccount(reader_account);
    }
    @Override
    public List<Violation> selectAllViolation() {
        return violationDAO.selectAllViolation();
    }
    @Override
    public List<Violation> selectViolation(String reader_account) {
        return violationDAO.selectViolation(reader_account);
    }
    @Override
    public List<BRRecord> selectAllRecord() {
        return brRecordDAO.selectAllRecord();
    }
    @Override
    public List<BRRecord> selectRecord(String account) {
        return brRecordDAO.selectRecord(account);
    }
    @Override
    public BRRecord selectRecordById(int id){
        return brRecordDAO.selectRecordById(id);
    }
    @Override
    public List<BookInfo> selectAllBook(){return bookInfoDAO.selectAllBook();}
    @Override
    public List<BookInfo> selectBook(String name){return bookInfoDAO.selectBook(name);}
    @Override
    public List<BookList> selectBookList(){return bookListDAO.selectBookList();}

    //注销一本书
    @Override
    public void insertBookCanceled(BookCanceled bookCanceled){bookCanceledDAO.insert(bookCanceled);}
    //查询注销的书
    @Override
    public List<BookCanceled> queryBookCanceled(){return bookCanceledDAO.query();}
    //查询丢失或损坏的书
    @Override
    public List<BookLostDamage> selectBookLostDamage(){return bookLostDamageDAO.select();}
    //丢失或损坏一本书
    @Override
    public void insertBookLostDamage(BookLostDamage bookLostDamage){bookLostDamageDAO.insert(bookLostDamage);}
    //借书记录还书
    @Override
    public void returnBRRecord(long id,java.sql.Date return_time,String in_operator){
        brRecordDAO.returnBook(id,return_time,in_operator);
    }
    //读者所持书减1
    @Override
    public void returnBook(String reader_account){readerInfoDAO.returnBook(reader_account);}
    //还书后书库状态置1
    @Override
    public void returnBookInfo(String book_id){bookInfoDAO.returnBook(book_id);}
    //图书征订
    @Override
    public void insertBookSubscription(BookSubscription bookSubscription){
        bookSubscriptionDAO.insert(bookSubscription);
    }
    //查询所有罚款记录
    @Override
    public List<BookFined> selectAllFined(){return bookFinedDAO.selectAllFined();}
    //查询某人的罚款记录
    @Override
    public List<BookFined> selectFined(String reader_account){return bookFinedDAO.selectFined(reader_account);}
    //增加一条罚款记录
    @Override
    public void insert(BookFined bookFined){bookFinedDAO.insert(bookFined);}
    //缴纳罚款
    @Override
    public void delete(long id,java.sql.Date finished_time){bookFinedDAO.delete(id,finished_time);}
    //读者所持书加1
    @Override
    public void borrowBook(String reader_account){readerInfoDAO.borrowBook(reader_account);}
    //借出书后书库状态置0
    @Override
    public void borrowBookInfo(String id){bookInfoDAO.borrowBook(id);}
    //增加一条BRRecord记录
    @Override
    public void borrowBRecord(BRRecord brRecord){brRecordDAO.borrowBook(brRecord);}
     //管理员登录
     @Override
    public List<ManagerAccount> login(String account,String password){
        return managerAccountMapper.selectManagerAccount(account,password);
    }
    @Override
    public List<ReaderInfo> selectAllReaderInfo(){
        return readerInfoDAO.selectAllReader();
    }
    @Override
    public List<Reader> queryAllReader(){return readerMapper.selectAllReader();}
    @Override
        //查询征订记录
    public List<BookSubscription> querySubscription(){
        return bookSubscriptionDAO.querySubscription();
    }
    @Override
    public void updateReader(Reader reader){
        ReaderInfo readerInfo=new ReaderInfo();
        readerInfo.setTime_available(reader.getTime_available());
        readerInfo.setReader_account(reader.getAccount());
        readerInfo.setRenew_max(reader.getRenew_max());
        readerInfo.setBook_borrow_max(reader.getBook_borrow_max());
        ReaderAccount readerAccount=new ReaderAccount();
        readerAccount.setAccount(reader.getAccount());
        readerAccount.setPassword(reader.getPassword());
        readerInfoDetailMapper.updateReaderInfoDetail(reader.getAccount(),reader.getPhone(),reader.getAddress());
        readerInfoDAO.updateReaderInfo(readerInfo);
        readerAccountDAO.updateReaderAccount(readerAccount);
    }
    @Override
    public void addfined(BookFined bookFined){
        bookFinedDAO.insert(bookFined);
    }
}
