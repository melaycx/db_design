package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.BookFinedMapper;
import cn.edu.zjut.po.BookFined;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookFinedDAO implements IBookFinedDAO{
    BookFinedMapper bookFinedMapper;
    @Autowired
    public void setBookFinedMapper(BookFinedMapper bookFinedMapper){
        this.bookFinedMapper=bookFinedMapper;
    }

    public List<BookFined> selectAllFined(){return bookFinedMapper.selectAllFined();}

    public List<BookFined> selectFined(String reader_account){return bookFinedMapper.selectFined(reader_account);}

    public void insert(BookFined bookFined){bookFinedMapper.insert(bookFined);}

    public void delete(long id,java.sql.Date finished_time){bookFinedMapper.delete(id,finished_time);}
}
