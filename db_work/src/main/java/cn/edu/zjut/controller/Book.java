package cn.edu.zjut.controller;
import cn.edu.zjut.po.BookInfo;
import cn.edu.zjut.po.BookInfoVO;
import cn.edu.zjut.service.IReaderService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class Book {
    IReaderService readerService;

    @Autowired
    public void setReaderService(IReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping("/book")
    @ResponseBody
    String query() {
        BookInfoVO bookInfoVO = new BookInfoVO();
        bookInfoVO.setCode("0");
        bookInfoVO.setMsg("");
        List<BookInfo> list = readerService.selectAllBook();
        bookInfoVO.setCount(list.size());
        bookInfoVO.setData(list);
        return new Gson().toJson(bookInfoVO);
    }
    @RequestMapping("/selectbook")
    @ResponseBody
    String query1(@RequestParam(value = "name") String name) {
        BookInfoVO bookInfoVO = new BookInfoVO();
        bookInfoVO.setCode("0");
        bookInfoVO.setMsg("");
        List<BookInfo> list = readerService.selectBook(name);
        bookInfoVO.setCount(list.size());
        bookInfoVO.setData(list);
        return new Gson().toJson(bookInfoVO);
    }
}
