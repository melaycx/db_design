package cn.edu.zjut.dao;

import cn.edu.zjut.po.Violation;

import java.util.List;

public interface IViolationDAO {
    List<Violation> selectAllViolation();
    List<Violation> selectViolation(String reader_account);
}
