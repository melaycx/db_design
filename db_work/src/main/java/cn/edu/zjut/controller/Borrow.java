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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Controller
public class Borrow {
    IReaderService readerService;
    IManagerService managerService;
    @Autowired
    public void setManagerService(IManagerService managerService){this.managerService=managerService;}
    @Autowired
    public void setReaderService(IReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping("/readerborrow")
    @ResponseBody
    String query(@RequestParam(value = "account") String account) {
        BRRecordVO brRecordVO = new BRRecordVO();
        brRecordVO.setCode("0");
        brRecordVO.setMsg("");
        List<BRRecord> list = readerService.selectRecord(account);
        brRecordVO.setCount(list.size());
        brRecordVO.setData(list);
        return new Gson().toJson(brRecordVO);
    }

    @RequestMapping("/borrow")
    @ResponseBody
    String query1() {
        BRRecordVO brRecordVO = new BRRecordVO();
        brRecordVO.setCode("0");
        brRecordVO.setMsg("");
        List<BRRecord> list = managerService.selectAllRecord();
        brRecordVO.setCount(list.size());
        brRecordVO.setData(list);
        return new Gson().toJson(brRecordVO);
    }

    @RequestMapping("/readerborrowbook")
    String fun1(@RequestParam(value = "id") String book_id, HttpSession session){

        ReaderAccount readerAccount=(ReaderAccount) session.getAttribute("user");
        String account=readerAccount.getAccount();
        ReaderInfo readerInfo=readerService.selectReaderInfo(account);
        int time_available=readerInfo.getTime_available();
        BRRecord brRecord=new BRRecord();
        brRecord.setReader_account(account);
        brRecord.setRenew(0);
        Date now=new Date();
        java.sql.Date date0=new java.sql.Date(now.getTime());
        brRecord.setBorrowed_time(date0);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MONTH,time_available);
        now=calendar.getTime();
        java.sql.Date date=new java.sql.Date(now.getTime());
        brRecord.setOut_operator("self");
        brRecord.setBook_id(book_id);
        brRecord.setOut_or_in(0);
        brRecord.setDeadline(date);
        readerService.borrowBook(account);
        readerService.borrowBookInfo(book_id);
        readerService.borrowBRecord(brRecord);
        return "reader_borrow.jsp";
    }

    @RequestMapping("/borrowbook")
    String fun2(@RequestParam(value = "id") String book_id,
                @RequestParam(value = "account")String account,
                HttpSession session){

        ManagerAccount managerAccount=(ManagerAccount) session.getAttribute("user");
        String operator=managerAccount.getAccount();
        ReaderInfo readerInfo=readerService.selectReaderInfo(account);
        int time_available=readerInfo.getTime_available();
        BRRecord brRecord=new BRRecord();
        brRecord.setReader_account(account);
        brRecord.setRenew(0);
        Date now=new Date();
        java.sql.Date date0=new java.sql.Date(now.getTime());
        brRecord.setBorrowed_time(date0);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MONTH,time_available);
        now=calendar.getTime();
        java.sql.Date date=new java.sql.Date(now.getTime());
        brRecord.setOut_operator(operator);
        brRecord.setBook_id(book_id);
        brRecord.setOut_or_in(0);
        brRecord.setDeadline(date);
        readerService.borrowBook(account);
        readerService.borrowBookInfo(book_id);
        readerService.borrowBRecord(brRecord);
        return "manager_borrow.jsp";
    }

    @RequestMapping("/renewbook")
    String fun2(@RequestParam(value = "id") String id,HttpSession session){
        int id0=Integer.parseInt(id);
        ReaderAccount readerAccount=(ReaderAccount) session.getAttribute("user");
        String account=readerAccount.getAccount();
        ReaderInfo readerInfo=readerService.selectReaderInfo(account);
        int time_available=readerInfo.getTime_available();
        BRRecord brRecord=managerService.selectRecordById(id0);
        java.sql.Date date=brRecord.getDeadline();
        Calendar calendar =new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.MONTH,time_available);
        java.util.Date utilDate = calendar.getTime();
        java.sql.Date deadline =new java.sql.Date(utilDate.getTime());
        readerService.renewBook(id0,deadline);
        return "reader_borrow.jsp";
    }
}
