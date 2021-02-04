package cn.edu.zjut.mapper;

import cn.edu.zjut.po.ReaderAccount;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReaderAccountMapper {
    @Insert("insert into reader_account (account, password) values (#{account}, #{password})")
    void addReaderAccount(ReaderAccount readerAccount);
    @Delete("delete from reader_account where account = #{arg0}")
    void deleteReaderAccount(String account);
    @Select("select * from reader_account")
    List<ReaderAccount> selectAllReaderAccount();
    @Select("select * from reader_account where account = #{arg0} and password = #{arg1}")
    ReaderAccount selectReaderAccount(String account,String password);
    @Update("update reader_account set password = #{password} where account = #{account}")
    void updateReaderAccount(ReaderAccount readerAccount);
}
