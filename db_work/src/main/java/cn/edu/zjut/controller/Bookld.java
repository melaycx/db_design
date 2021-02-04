package cn.edu.zjut.controller;
import cn.edu.zjut.po.*;
import cn.edu.zjut.service.IManagerService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class Bookld {
        IManagerService managerService;

        @Autowired
       public void setManagerService(IManagerService managerService){this.managerService=managerService;}

        @RequestMapping("/ldquery")
        @ResponseBody
        String query() {
            BookLostDamageVO bookLostDamageVO = new BookLostDamageVO();
            bookLostDamageVO.setCode("0");
            bookLostDamageVO.setMsg("");
            List<BookLostDamage> list = managerService.selectBookLostDamage();
            bookLostDamageVO.setCount(list.size());
            bookLostDamageVO.setData(list);
            return new Gson().toJson(bookLostDamageVO);
        }

    @RequestMapping("/ld")
    String fun(@RequestParam(value = "account")String account,
               @RequestParam(value = "book_id")String book_id,
               @RequestParam(value = "type") String type0
    ) {
            int type=2;
            if(type0.equals("丢失")){type=0;}
            if(type0.equals("损坏")){type=1;}
        Date now=new Date();
        java.sql.Date date=new java.sql.Date(now.getTime());
       BookLostDamage bookLostDamage=new BookLostDamage();
       bookLostDamage.setBook_id(book_id);
       bookLostDamage.setReader_account(account);
       bookLostDamage.setReport_time(date);
       bookLostDamage.setType(type);
        managerService.insertBookLostDamage(bookLostDamage);
        return "manager_ld_query.jsp";
    }
}
