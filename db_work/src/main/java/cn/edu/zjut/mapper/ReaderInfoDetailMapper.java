package cn.edu.zjut.mapper;

import cn.edu.zjut.po.Reader;
import cn.edu.zjut.po.ReaderInfoDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReaderInfoDetailMapper {

    @Select("select * from reader_info_detail")
    List<ReaderInfoDetail> selectAllReader();

    @Select("select * from reader_info_detail where reader_account = #{arg0}")
    ReaderInfoDetail selectReader(String reader_account);

    @Insert("insert into reader_info_detail (name, sex, phone, reader_account, address, idcard) values (#{name}, #{sex}, #{phone}, #{reader_account}, #{address}, #{idcard})")
    void addReaderInfoDetail(ReaderInfoDetail readerInfoDetail);

    @Delete("delete from reader_info_detail where reader_account = #{arg0}")
    void deleteReaderInfoDetail(String reader_account);
    //更新某个读者的信息(电话与地址)
    @Update("update reader_info_detail set phone = #{arg1},address = #{arg2} where reader_account = #{arg0}")
    void updateReaderInfoDetail(String account,String phone,String address);
}
