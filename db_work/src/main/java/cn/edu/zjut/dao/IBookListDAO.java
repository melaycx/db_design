package cn.edu.zjut.dao;

import cn.edu.zjut.po.BookList;

import java.util.List;

public interface IBookListDAO {
    List<BookList> selectBookList();
}
