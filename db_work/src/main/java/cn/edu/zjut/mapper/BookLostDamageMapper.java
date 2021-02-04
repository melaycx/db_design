package cn.edu.zjut.mapper;

import cn.edu.zjut.po.BookLostDamage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookLostDamageMapper {
    @Insert("insert into book_lost_damage(reader_account, report_time, type, book_id) values (#{reader_account}, #{report_time}, #{type}, #{book_id})")
    void insert(BookLostDamage bookLostDamage);
    @Select("select * from book_lost_damage")
    List<BookLostDamage> select();
}
