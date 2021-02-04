package cn.edu.zjut.controller;

import cn.edu.zjut.po.*;
import cn.edu.zjut.service.IManagerService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ManageReader {
    IManagerService managerService;
    @Autowired
    public void setManagerService(IManagerService managerService){this.managerService=managerService;}

    @RequestMapping("/readerquery")
    @ResponseBody
    String query() {
        ReaderVO readerVO = new ReaderVO();
        readerVO.setCode("0");
        readerVO.setMsg("");
        List<Reader> list= managerService.queryAllReader();
        readerVO.setCount(list.size());
        readerVO.setData(list);
        return new Gson().toJson(readerVO);
    }

    @RequestMapping(value = "/addreader")
    public String addReader(@RequestParam(value = "phone") String phone,
   @RequestParam(value = "address") String address,@RequestParam(value = "account") String account,
   @RequestParam(value = "password") String password,@RequestParam(value = "idcard") String idcard,
   @RequestParam(value = "sex") String sex,@RequestParam(value = "name") String name){
        int sex0;
        if(sex.equals("男"))sex0=0;
        else sex0=1;
        Reader reader=new Reader(account,password,5,3,3,0,0,name,sex0,phone,address,idcard);
        managerService.addReader(reader);

        return "manager_queryreader.jsp";
    }

    @RequestMapping(value = "/modifyreader")
    public String updateReader(@RequestParam(value = "phone") String phone,
                         @RequestParam(value = "address") String address,@RequestParam(value = "account") String account,
                         @RequestParam(value = "password") String password,@RequestParam(value = "book_borrow_max") int book_borrow_max,
                         @RequestParam(value = "renew_max") int renew_max,@RequestParam(value = "time_available") int time_available){
        Reader reader=new Reader();
        reader.setAccount(account);
        reader.setAddress(address);
        reader.setBook_borrow_max(book_borrow_max);
        reader.setRenew_max(renew_max);
        reader.setTime_available(time_available);
        reader.setPassword(password);
        reader.setPhone(phone);
        managerService.updateReader(reader);
        return "manager_queryreader.jsp";
    }

    @RequestMapping(value = "/deletereader")
    public String updateReader(@RequestParam(value = "account") String account){
        managerService.deleteReader(account);
        return "manager_queryreader.jsp";
    }
}
