package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.ReaderInfoDetailMapper;
import cn.edu.zjut.mapper.ReaderInfoMapper;
import cn.edu.zjut.po.Reader;
import cn.edu.zjut.po.ReaderInfo;
import cn.edu.zjut.po.ReaderInfoDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReaderInfoDAO implements IReaderInfoDAO{
    ReaderInfoMapper readerInfoMapper;

    @Autowired
    public void setReaderInfoMapper(ReaderInfoMapper readerInfoMapper) {
        this.readerInfoMapper = readerInfoMapper;
    }

    @Override
    public void addReaderInfo(Reader reader){
        ReaderInfo readerInfo=new ReaderInfo();
        readerInfo.setReader_account(reader.getAccount());
        readerInfo.setBook_borrow_max(reader.getBook_borrow_max());
        readerInfo.setKept_book(reader.getKept_book());
        readerInfo.setRenew_max(reader.getRenew_max());
        readerInfo.setViolation(reader.getViolation());
        readerInfo.setTime_available(reader.getTime_available());
        readerInfoMapper.addReaderInfo(readerInfo);
    }
    @Override
    public void deleteReaderInfo(String reader_account){
        readerInfoMapper.deleteReaderInfo(reader_account);
    }
    @Override
    public void returnBook(String reader_account){readerInfoMapper.returnBook(reader_account);}
    @Override
    public void borrowBook(String reader_account){
        readerInfoMapper.borrowBook(reader_account);
    }
    @Override
    public ReaderInfo selectReader(String reader_account){return readerInfoMapper.selectReader(reader_account);}
    @Override
    public List<ReaderInfo> selectAllReader(){
        return readerInfoMapper.selectAllReader();
    }
    @Override
    public void updateReaderInfo(ReaderInfo readerInfo){
        readerInfoMapper.updateReaderInfo(readerInfo);
    }
}
