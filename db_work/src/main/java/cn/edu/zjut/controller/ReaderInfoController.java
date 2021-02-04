package cn.edu.zjut.controller;

import cn.edu.zjut.po.ReaderAccount;
import cn.edu.zjut.po.ReaderInfoDetail;
import cn.edu.zjut.service.IReaderService;
import cn.edu.zjut.service.ReaderService;
import com.google.gson.Gson;
import com.mysql.cj.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
@SessionAttributes(value={"user","sex","infodetail","info"},types={String.class})
@Controller
public class ReaderInfoController {
    IReaderService readerService;

    @Autowired
    public void setReaderService(IReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping(value = "/readerinfo")
    public String update(@RequestParam(value = "phone") String phone, @RequestParam(value = "address") String address,
      HttpSession session ,Map<String,Object>map){
        ReaderAccount user=(ReaderAccount)session.getAttribute("user");
        String account= user.getAccount();
        readerService.updateReaderInfoDetail(account,phone,address);
        ReaderInfoDetail readerInfoDetail=readerService.selectReaderInfoDetail(account);
        map.put("infodetail",readerInfoDetail);
                return "reader_info.jsp";
    }
}
