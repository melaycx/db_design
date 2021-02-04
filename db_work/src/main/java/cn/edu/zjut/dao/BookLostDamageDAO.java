package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.BookLostDamageMapper;
import cn.edu.zjut.po.BookLostDamage;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookLostDamageDAO implements IBookLostDamageDAO{
    BookLostDamageMapper bookLostDamageMapper;
    @Autowired
    public void setBookLostDamageMapper(BookLostDamageMapper bookLostDamageMapper){
        this.bookLostDamageMapper=bookLostDamageMapper;
    }
    public void insert(BookLostDamage bookLostDamage){bookLostDamageMapper.insert(bookLostDamage);}

    public List<BookLostDamage> select(){return bookLostDamageMapper.select();}
}
