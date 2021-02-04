package cn.edu.zjut.controller;

import cn.edu.zjut.po.BRRecord;
import cn.edu.zjut.po.BRRecordVO;
import cn.edu.zjut.po.ManagerAccount;
import cn.edu.zjut.po.ReaderAccount;
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
public class Return {
    IReaderService readerService;
    IManagerService managerService;
    @Autowired
    public void setManagerService(IManagerService managerService){this.managerService=managerService;}
    @Autowired
    public void setReaderService(IReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping("/readerreturn")
    String fun(@RequestParam(value = "id0") String id0, @RequestParam(value = "id1") String book_id,
               HttpSession session) {
        int record_id=Integer.parseInt(id0);
        ReaderAccount readerAccount=(ReaderAccount)session.getAttribute("user");
        String operator=readerAccount.getAccount();
        Date now=new Date();
        java.sql.Date date=new java.sql.Date(now.getTime());
        readerService.returnBRRecord(record_id,date,"self");
        readerService.returnBook(operator);
        readerService.returnBookInfo(book_id);
        return "reader_borrow.jsp";
    }

    @RequestMapping("/managerreturn")
    String fun1(@RequestParam(value = "id0") String id0,@RequestParam(value = "id1") String book_id,
             HttpSession session) {
        int record_id=Integer.parseInt(id0);
        ManagerAccount managerAccount=(ManagerAccount) session.getAttribute("user");
        String operator=managerAccount.getAccount();
        Date now=new Date();
        java.sql.Date date=new java.sql.Date(now.getTime());
        BRRecord brRecord=managerService.selectRecordById(record_id);
        String account=brRecord.getReader_account();
        managerService.returnBRRecord(record_id,date,operator);
        managerService.returnBook(account);
        managerService.returnBookInfo(book_id);
        return "manager_returnbook.jsp";
    }
}
