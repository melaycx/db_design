package cn.edu.zjut.dao;

import cn.edu.zjut.po.BookFined;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBookFinedDAO {

    List<BookFined> selectAllFined();

    List<BookFined> selectFined(String reader_account);

    void insert(BookFined bookFined);

    void delete(long id,java.sql.Date finished_time);
}
