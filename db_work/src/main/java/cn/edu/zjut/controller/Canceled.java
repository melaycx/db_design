package cn.edu.zjut.controller;
import cn.edu.zjut.po.BookCanceled;
import cn.edu.zjut.po.BookCanceledVO;
import cn.edu.zjut.service.IManagerService;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;

@Controller
public class Canceled {

    IManagerService managerService;
    @Autowired
    public void setManagerService(IManagerService managerService){this.managerService=managerService;}
    @RequestMapping("/canceledquery")
    @ResponseBody
    String query1() {
        BookCanceledVO bookCanceledVO = new BookCanceledVO();
        bookCanceledVO.setCode("0");
        bookCanceledVO.setMsg("");
        List<BookCanceled> list = managerService.queryBookCanceled();
        bookCanceledVO.setCount(list.size());
        bookCanceledVO.setData(list);
        return new Gson().toJson(bookCanceledVO);
    }

    @RequestMapping("/canceled")
    String fun(@RequestParam (value = "book_id")String book_id) {
             Date now=new Date();
             java.sql.Date date=new java.sql.Date(now.getTime());
             BookCanceled bookCanceled=new BookCanceled();
             bookCanceled.setCanceled_time(date);
             bookCanceled.setBook_id(book_id);
             managerService.insertBookCanceled(bookCanceled);
             return "manager_canceled_query.jsp";
    }
}


