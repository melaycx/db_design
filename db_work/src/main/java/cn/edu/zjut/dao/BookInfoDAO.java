package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.BookInfoMapper;
import cn.edu.zjut.po.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookInfoDAO implements IBookInfoDAO{
    BookInfoMapper bookInfoMapper;
    @Autowired
    public void setBookInfoMapper(BookInfoMapper bookInfoMapper){
        this.bookInfoMapper=bookInfoMapper;
    }
    @Override
    public List<BookInfo> selectAllBook(){
        return bookInfoMapper.selectAllBook();
    }
    @Override
    public void returnBook(String id){bookInfoMapper.returnBook(id);}
    @Override
    public List<BookInfo> selectBook(String name){
        return bookInfoMapper.selectBook(name);
    }
    @Override
    public void borrowBook(String id){bookInfoMapper.borrowBook(id);}
    @Override
    public void delete(String id){bookInfoMapper.delete(id);}
}
