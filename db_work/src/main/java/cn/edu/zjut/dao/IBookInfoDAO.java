package cn.edu.zjut.dao;

import cn.edu.zjut.po.BookInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBookInfoDAO {
    List<BookInfo> selectAllBook();

    List<BookInfo> selectBook(String name);
    void returnBook(String id);
    void borrowBook(String id);
    void delete(String id);
}
