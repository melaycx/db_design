package cn.edu.zjut.dao;

import cn.edu.zjut.po.BookCanceled;

import java.util.List;

public interface IBookCanceledDAO {
    void insert(BookCanceled bookCanceled);
    List<BookCanceled> query();

}
