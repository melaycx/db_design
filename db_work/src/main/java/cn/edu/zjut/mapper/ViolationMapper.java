package cn.edu.zjut.mapper;

import cn.edu.zjut.po.Violation;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ViolationMapper {
    @Select("select * from violation")
    List<Violation> selectAllViolation();
    @Select("select * from violation where reader_account = #{arg0}")
    List<Violation> selectViolation(String reader_account);
}
