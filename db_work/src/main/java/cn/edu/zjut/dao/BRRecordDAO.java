package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.BRRecordMapper;
import cn.edu.zjut.po.BRRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BRRecordDAO implements IBRRecordDAO{
    BRRecordMapper brRecordMapper;
    @Autowired
    public void setBrRecordMapper(BRRecordMapper brRecordMapper){
        this.brRecordMapper=brRecordMapper;
    }
    @Override
    public List<BRRecord> selectAllRecord(){
        return brRecordMapper.selectAllRecord();
    }
    @Override
    public List<BRRecord> selectRecord(String reader_account){
        return brRecordMapper.selectRecord(reader_account);
    }
    @Override
    public void returnBook(long id,java.sql.Date return_time,String in_operator){
        brRecordMapper.returnBook(id,return_time,in_operator);
    }
    @Override
    public void renew(long id,java.sql.Date deadline){
        brRecordMapper.renew(id,deadline);
    }
    @Override
    public void borrowBook(BRRecord brRecord){
        brRecordMapper.borrowBook(brRecord);
    }
    @Override
    public BRRecord selectRecordById(int id){
        return brRecordMapper.selectRecordById(id);
    }
}
