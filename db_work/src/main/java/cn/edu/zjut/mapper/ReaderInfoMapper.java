package cn.edu.zjut.mapper;

import cn.edu.zjut.po.ReaderInfo;
import cn.edu.zjut.po.ReaderInfoDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReaderInfoMapper {
    @Insert("insert into reader_info (book_borrow_max, renew_max, time_available, reader_account, kept_book, violation) values (#{book_borrow_max}, #{renew_max}, #{time_available}, #{reader_account}, #{kept_book}, #{violation})")
    void addReaderInfo(ReaderInfo readerInfo);
    @Delete("delete from reader_info where reader_account = #{arg0}")
    void deleteReaderInfo(String reader_account);
    @Update("update reader_info set kept_book = kept_book - 1 where reader_account = #{arg0}")
    void returnBook(String reader_account);
    @Update("update reader_info set kept_book = kept_book + 1 where reader_account = #{arg0}")
    void borrowBook(String reader_account);
    @Select("select * from reader_info where reader_account = #{arg0}")
    ReaderInfo selectReader(String reader_account);
    @Select("select * from reader_info")
    List<ReaderInfo> selectAllReader();
    @Update("update reader_info set book_borrow_max = #{book_borrow_max},renew_max = #{renew_max},time_available = #{time_available} where reader_account = #{reader_account}")
    void updateReaderInfo(ReaderInfo readerInfo);
}
