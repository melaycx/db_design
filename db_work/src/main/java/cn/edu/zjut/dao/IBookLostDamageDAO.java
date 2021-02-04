package cn.edu.zjut.dao;

import cn.edu.zjut.po.BookLostDamage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBookLostDamageDAO {
    void insert(BookLostDamage bookLostDamage);

    List<BookLostDamage> select();
}
