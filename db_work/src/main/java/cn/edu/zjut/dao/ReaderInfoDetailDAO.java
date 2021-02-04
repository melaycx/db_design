package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.ReaderInfoDetailMapper;
import cn.edu.zjut.po.Reader;
import cn.edu.zjut.po.ReaderAccount;
import cn.edu.zjut.po.ReaderInfoDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReaderInfoDetailDAO implements IReaderInfoDetailDAO {

    ReaderInfoDetailMapper readerInfoDetailMapper;

    @Autowired
    public void setReaderInfoDetailMapper(ReaderInfoDetailMapper readerInfoDetailMapper) {
        this.readerInfoDetailMapper = readerInfoDetailMapper;
    }

    @Override
    public List<ReaderInfoDetail> selectAllReader() {
        return readerInfoDetailMapper.selectAllReader();
    }

    @Override
    public void addReaderInfoDetail(Reader reader){
         ReaderInfoDetail readerInfoDetail=new ReaderInfoDetail();
         readerInfoDetail.setAddress(reader.getAddress());
         readerInfoDetail.setReader_account(reader.getAccount());
         readerInfoDetail.setIdcard(reader.getIdcard());
         readerInfoDetail.setPhone(reader.getPhone());
         readerInfoDetail.setSex(reader.getSex());
         readerInfoDetail.setName(reader.getName());
         readerInfoDetailMapper.addReaderInfoDetail(readerInfoDetail);
    }
    @Override
   public void deleteReaderInfoDetail(String reader_account){
        readerInfoDetailMapper.deleteReaderInfoDetail(reader_account);
    }
    @Override
    public ReaderInfoDetail selectReader(String reader_account){
        return readerInfoDetailMapper.selectReader(reader_account);
    }
    @Override
    public //更新某个读者的信息(电话与地址)
    void updateReaderInfoDetail(String account,String phone,String address){
        readerInfoDetailMapper.updateReaderInfoDetail(account,phone,address);
    }
}
