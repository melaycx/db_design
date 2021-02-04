package cn.edu.zjut.dao;

import cn.edu.zjut.po.Reader;
import cn.edu.zjut.po.ReaderInfo;

import java.util.List;

public interface IReaderInfoDAO {
    void addReaderInfo(Reader reader);
    void deleteReaderInfo(String reader_account);
    void returnBook(String reader_account);
    void borrowBook(String reader_account);
    ReaderInfo selectReader(String reader_account);
    List<ReaderInfo> selectAllReader();
    void updateReaderInfo(ReaderInfo readerInfo);
}
