package cn.edu.zjut.controller;

import cn.edu.zjut.po.*;
import cn.edu.zjut.service.IManagerService;
import cn.edu.zjut.service.IReaderService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class Subscription {
    IManagerService managerService;
    @Autowired
    public void setManagerService(IManagerService managerService) {
        this.managerService = managerService;
    }
    @RequestMapping("/booklist")
    @ResponseBody
    String query() {
        BookListVO bookListVO = new BookListVO();
        bookListVO.setCode("0");
        bookListVO.setMsg("");
        List<BookList> list = managerService.selectBookList();
        bookListVO.setCount(list.size());
        bookListVO.setData(list);
        return new Gson().toJson(bookListVO);
    }
    @RequestMapping("/querysubscription")
    @ResponseBody
    String query1() {
        BookSubscriptionVO bookSubscriptionVO = new BookSubscriptionVO();
        bookSubscriptionVO.setCode("0");
        bookSubscriptionVO.setMsg("");
        List<BookSubscription> list = managerService.querySubscription();
        bookSubscriptionVO.setCount(list.size());
        bookSubscriptionVO.setData(list);
        return new Gson().toJson(bookSubscriptionVO);
    }


    @RequestMapping("/subscription")
    String fun(@RequestParam(value = "isbn")String isbn,
               @RequestParam(value = "amount")String amount0,
                HttpSession session
    ) {
        int amount=Integer.parseInt(amount0);
        Date now=new Date();
        java.sql.Date date=new java.sql.Date(now.getTime());
        ManagerAccount managerAccount =(ManagerAccount)session.getAttribute("user");
        String operator=managerAccount.getAccount();
        BookSubscription bookSubscription=new BookSubscription();
        bookSubscription.setSubscription_time(date);
        bookSubscription.setAmount(amount);
        bookSubscription.setIsbn(isbn);
        bookSubscription.setOperator(operator);
        managerService.insertBookSubscription(bookSubscription);
        return "manager_querysubscription.jsp";
    }
}