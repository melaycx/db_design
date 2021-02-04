package cn.edu.zjut.service;

import cn.edu.zjut.dao.*;
import cn.edu.zjut.mapper.ManagerAccountMapper;
import cn.edu.zjut.mapper.ReaderAccountMapper;
import cn.edu.zjut.po.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReaderService implements IReaderService{
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
    ReaderAccountMapper readerAccountMapper;
    @Autowired
    public void setReaderAccountMapper(ReaderAccountMapper readerAccountMapper){
        this.readerAccountMapper=readerAccountMapper;
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



    //读者所持书加1
    public void borrowBook(String reader_account){readerInfoDAO.borrowBook(reader_account);}
    //借出书后书库状态置0
    public void borrowBookInfo(String id){bookInfoDAO.borrowBook(id);}
    //增加一条BRRecord记录
    public void borrowBRecord(BRRecord brRecord){brRecordDAO.borrowBook(brRecord);}
    public List<BookInfo> selectAllBook(){return bookInfoDAO.selectAllBook();}
    public List<BookInfo> selectBook(String name){return bookInfoDAO.selectBook(name);}
    //缴纳罚款
    public void delete(long id,java.sql.Date finished_time){bookFinedDAO.delete(id,finished_time);}

    //查询某人的罚款记录
    public List<BookFined> selectFined(String reader_account){return bookFinedDAO.selectFined(reader_account);}
    public void renewBook(long id,java.sql.Date deadline){
        brRecordDAO.renew(id,deadline);
    }
    public List<BRRecord> selectRecord(String account) {
        return brRecordDAO.selectRecord(account);
    }
    //借书记录还书
    public void returnBRRecord(long id,java.sql.Date return_time,String in_operator){
        brRecordDAO.returnBook(id,return_time,in_operator);
    }
    //读者所持书减1
    public void returnBook(String reader_account){readerInfoDAO.returnBook(reader_account);}
    //还书后书库状态置1
    public void returnBookInfo(String book_id){bookInfoDAO.returnBook(book_id);}
    public List<Violation> selectViolation(String reader_account) {
        return violationDAO.selectViolation(reader_account);
    }
    //读者登录
    public ReaderAccount login(String account, String password){
        return readerAccountMapper.selectReaderAccount(account,password);
    }

    public ReaderInfo selectReaderInfo(String reader_account){
        return readerInfoDAO.selectReader(reader_account);
    }

    public ReaderInfoDetail selectReaderInfoDetail(String reader_account){
        return readerInfoDetailDAO.selectReader(reader_account);
    }
    //更新某个读者的信息(电话与地址)
    public void updateReaderInfoDetail(String account,String phone,String address){
        readerInfoDetailDAO.updateReaderInfoDetail(account,phone,address);
    }
    //缴纳罚款
    public void finishfined(int id,java.sql.Date time){
        bookFinedDAO.delete(id,time);
    }
}
