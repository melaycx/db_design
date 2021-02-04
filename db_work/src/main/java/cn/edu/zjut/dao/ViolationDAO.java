package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.ViolationMapper;
import cn.edu.zjut.po.Violation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ViolationDAO implements IViolationDAO{
    ViolationMapper violationMapper;
    @Autowired
    public void setViolationMapper(ViolationMapper violationMapper){
        this.violationMapper=violationMapper;
    }
    @Override
    public List<Violation> selectAllViolation(){
         return violationMapper.selectAllViolation();
    }
    @Override
    public List<Violation> selectViolation(String reader_account){
       return violationMapper.selectViolation(reader_account);
    }
}
