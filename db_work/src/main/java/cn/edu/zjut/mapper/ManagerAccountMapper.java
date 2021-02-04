package cn.edu.zjut.mapper;

import cn.edu.zjut.po.ManagerAccount;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ManagerAccountMapper {
    @Select("select * from manager_account where account = #{arg0} and password = #{arg1}")
    List<ManagerAccount> selectManagerAccount(String account, String password);
}
