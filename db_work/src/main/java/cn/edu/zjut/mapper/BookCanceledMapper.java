package cn.edu.zjut.mapper;

import cn.edu.zjut.po.BookCanceled;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookCanceledMapper {
    @Insert("insert into book_canceled(book_id, canceled_time) values (#{book_id}, #{canceled_time})")
    void insert(BookCanceled bookCanceled);
    @Select("select * from book_canceled")
    List<BookCanceled> query();
}
