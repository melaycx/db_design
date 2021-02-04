package cn.edu.zjut.dao;

import cn.edu.zjut.po.Reader;
import cn.edu.zjut.po.ReaderInfoDetail;

import java.util.List;

public interface IReaderInfoDetailDAO {
     List<ReaderInfoDetail> selectAllReader();
     void addReaderInfoDetail(Reader reader);
     void deleteReaderInfoDetail(String reader_account);
     ReaderInfoDetail selectReader(String reader_account);
     //更新某个读者的信息(电话与地址)
     void updateReaderInfoDetail(String account,String phone,String address);
}
