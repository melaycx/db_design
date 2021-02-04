package cn.edu.zjut.mapper;

import cn.edu.zjut.po.BRRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BRRecordMapper {
    @Select("select * from book_borrowed_returned order by out_or_in asc")
    List<BRRecord> selectAllRecord();
    @Select("select * from book_borrowed_returned where reader_account = #{arg0} order by out_or_in asc")
    List<BRRecord> selectRecord(String reader_account);
    @Update("update book_borrowed_returned set return_time = #{arg1},in_operator = #{arg2},out_or_in = 1 where id = #{arg0}")
    void returnBook(long id,java.sql.Date return_time,String in_operator);
    @Insert("insert into book_borrowed_returned(reader_account, borrowed_time, return_time, renew, book_id, out_operator, deadline, out_or_in, in_operator) values(#{reader_account}, #{borrowed_time}, #{return_time}, #{renew}, #{book_id}, #{out_operator}, #{deadline}, #{out_or_in}, #{in_operator})")
    void borrowBook(BRRecord brRecord);
    @Update("update book_borrowed_returned set renew = renew + 1, deadline = #{arg1} where id = #{arg0}")
    void renew(long id,java.sql.Date deadline);
    @Select("select * from book_borrowed_returned where id= #{arg0}")
    BRRecord selectRecordById(int id);
}
