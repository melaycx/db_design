package cn.edu.zjut.dao;

import cn.edu.zjut.po.Reader;
import cn.edu.zjut.po.ReaderAccount;

import java.util.List;

public interface IReaderAccountDAO {
    void addReaderAccount(Reader reader);
    void deleteReaderAccount(String account);
    List<ReaderAccount> selectAllReaderAccount();
    void updateReaderAccount(ReaderAccount readerAccount);
}
