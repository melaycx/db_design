package cn.edu.zjut.mapper;

import cn.edu.zjut.po.BookFined;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookFinedMapper {
    @Select("select * from book_fined")
    List<BookFined> selectAllFined();
    @Select("select * from book_fined where reader_account = #{arg0}")
    List<BookFined> selectFined(String reader_account);
    @Insert("insert into book_fined(reader_account, fined_time, fined_amount, finished,  book_id, operator) values(#{reader_account}, #{fined_time}, #{fined_amount}, #{finished}, #{book_id}, #{operator})")
    void insert(BookFined bookFined);
    @Update("update book_fined set finished = 1 , finished_time = #{arg1} where id = #{arg0}")
    void delete(long id,java.sql.Date finished_time);

}
