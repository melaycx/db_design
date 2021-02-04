package cn.edu.zjut.controller;
import cn.edu.zjut.po.BookFined;
import cn.edu.zjut.po.BookFinedVO;
import cn.edu.zjut.po.ManagerAccount;
import cn.edu.zjut.service.IManagerService;
import cn.edu.zjut.service.IReaderService;
import cn.edu.zjut.service.ReaderService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class Fined {
    IReaderService readerService;
    IManagerService managerService;
    @Autowired
    public void setManagerService(IManagerService managerService){this.managerService=managerService;}
    @Autowired
    public void setReaderService(IReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping("/readerfined")
    @ResponseBody
    String query(@RequestParam(value = "account") String account) {
        BookFinedVO bookFinedVO = new BookFinedVO();
        bookFinedVO.setCode("0");
        bookFinedVO.setMsg("");
        List<BookFined> list = readerService.selectFined(account);
        bookFinedVO.setCount(list.size());
        bookFinedVO.setData(list);
        return new Gson().toJson(bookFinedVO);
    }

    @RequestMapping("/finedquery")
    @ResponseBody
    String query1() {
        BookFinedVO bookFinedVO = new BookFinedVO();
        bookFinedVO.setCode("0");
        bookFinedVO.setMsg("");
        List<BookFined> list = managerService.selectAllFined();
        bookFinedVO.setCount(list.size());
        bookFinedVO.setData(list);
        return new Gson().toJson(bookFinedVO);
    }


    @RequestMapping("/fined")
    String fun(@RequestParam(value = "book_id")String book_id,
               @RequestParam(value = "amount")String amount0,
               @RequestParam(value = "account")String account, HttpSession session
               ) {
        float amount=Float.parseFloat(amount0);
        Date now=new Date();
        java.sql.Date date=new java.sql.Date(now.getTime());
        ManagerAccount managerAccount =(ManagerAccount)session.getAttribute("user");
        String operator=managerAccount.getAccount();
        BookFined bookFined=new BookFined();
        bookFined.setBook_id(book_id);
        bookFined.setFined_amount(amount);
        bookFined.setFined_time(date);
        bookFined.setReader_account(account);
        bookFined.setOperator(operator);
        bookFined.setFinished(0);
        managerService.addfined(bookFined);
        return "manager_fined_query.jsp";
    }
    @RequestMapping("/finishfined")
    String fun1(@RequestParam(value = "id")String id
    ) {
        int id0=Integer.parseInt(id);
        Date now=new Date();
        java.sql.Date date=new java.sql.Date(now.getTime());
        readerService.delete(id0,date);
        return "reader_fined.jsp";
    }

    @RequestMapping(value = "/testAjax", method = RequestMethod.GET)
    @ResponseBody
    public String testAjax(String account) {
        System.out.println(account);
//        Date now = new Date("yyyy-MM-dd");
//
//        java.sql.Date date = new java.sql.Date(now.getTime());
//        readerService.delete(1, date);
        String link = "abc";
        return link;
    }
}
