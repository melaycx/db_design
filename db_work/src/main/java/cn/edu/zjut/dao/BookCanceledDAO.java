package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.BookCanceledMapper;
import cn.edu.zjut.po.BookCanceled;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookCanceledDAO implements IBookCanceledDAO{
    BookCanceledMapper bookCanceledMapper;
    @Autowired
    public void setBookCanceledMapper(BookCanceledMapper bookCanceledMapper){
        this.bookCanceledMapper=bookCanceledMapper;
    }
    public void insert(BookCanceled bookCanceled){bookCanceledMapper.insert(bookCanceled);}
    public List<BookCanceled> query(){return bookCanceledMapper.query();}
}
