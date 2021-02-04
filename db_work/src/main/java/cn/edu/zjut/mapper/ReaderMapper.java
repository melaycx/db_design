package cn.edu.zjut.mapper;

import cn.edu.zjut.po.Reader;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReaderMapper {
    @Select("select * from reader")
    List<Reader> selectAllReader();
}
