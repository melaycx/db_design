package cn.edu.zjut.mapper;

import cn.edu.zjut.po.BookList;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookListMapper {
    @Select("select * from book_list")
    List<BookList> selectBookList();
}
