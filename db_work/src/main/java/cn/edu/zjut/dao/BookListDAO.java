package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.BookListMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookListDAO implements IBookListDAO {
    BookListMapper bookListMapper;
    @Autowired
    public void setBookListMapper(BookListMapper bookListMapper){this.bookListMapper=bookListMapper;}
    @Override
    public List<cn.edu.zjut.po.BookList> selectBookList(){
        return bookListMapper.selectBookList();
    }
}
