package cn.edu.zjut.mapper;

import cn.edu.zjut.po.BookInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookInfoMapper {
    @Select("select * from book_info")
    List<BookInfo> selectAllBook();
    @Select("select * from book_info where name = #{arg0}")
    List<BookInfo> selectBook(String name);
    @Update("update book_info set out_or_in = 1 where id = #{arg0}")
    void returnBook(String id);
    @Update("update book_info set out_or_in = 0 where id = #{arg0}")
    void borrowBook(String id);
    @Delete("delete from book_info where id = #{arg0}")
    void delete(String id);

}
