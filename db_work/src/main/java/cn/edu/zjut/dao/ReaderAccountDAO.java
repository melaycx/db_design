package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.ReaderAccountMapper;
import cn.edu.zjut.mapper.ReaderInfoDetailMapper;
import cn.edu.zjut.po.Reader;
import cn.edu.zjut.po.ReaderAccount;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReaderAccountDAO implements IReaderAccountDAO{
    ReaderAccountMapper readerAccountMapper;

    @Autowired
    public void setReaderAccountMapper(ReaderAccountMapper readerAccountMapper) {
        this.readerAccountMapper = readerAccountMapper;
    }
    @Override
    public void addReaderAccount(Reader reader){
        ReaderAccount readerAccount=new ReaderAccount(reader.getAccount(),reader.getPassword());
        readerAccountMapper.addReaderAccount(readerAccount);
    }
    @Override
    public void deleteReaderAccount(String account){

        readerAccountMapper.deleteReaderAccount(account);
    }
    @Override
    public List<ReaderAccount> selectAllReaderAccount(){return readerAccountMapper.selectAllReaderAccount();}
    @Override
    public void updateReaderAccount(ReaderAccount readerAccount){readerAccountMapper.updateReaderAccount(readerAccount);}
}
