package cn.edu.zjut.controller;

import cn.edu.zjut.po.ManagerAccount;
import cn.edu.zjut.po.ReaderAccount;
import cn.edu.zjut.po.ReaderInfoDetail;
import cn.edu.zjut.po.UserAccount;
import cn.edu.zjut.service.IManagerService;
import cn.edu.zjut.service.IReaderService;
import cn.edu.zjut.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@SessionAttributes(value={"user","sex","infodetail","info"},types={String.class})
@Controller
public class Login {
    private IReaderService readerService;
    private IManagerService managerService;

    @RequestMapping(value = "/login", method = GET)
    public ModelAndView login() {
        return new ModelAndView("login.jsp", "userAccount", new UserAccount());
    }
    @Autowired
    public void setManagerService(IManagerService managerService) {
        this.managerService = managerService;
    }

    @Autowired
    public void setReaderService(IReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping(value = "/login", method = POST,produces = "text/html")
    public String login(@ModelAttribute("userAccount") UserAccount userAccount, Map<String,Object>map) {
        if(userAccount.getType()==0){
            if(managerService.login(userAccount.getAccount(), userAccount.getPassword())==null)
                return "login.jsp";
            else{
                ManagerAccount managerAccount=new ManagerAccount(userAccount.getAccount(), userAccount.getPassword());
                map.put("user", managerAccount);
                //session.setAttribute("user",managerAccount);
                return "manager_book.jsp";
            }
        }
        else{
            if(readerService.login(userAccount.getAccount(), userAccount.getPassword())==null)
                return "login.jsp";
            else {
                ReaderAccount readerAccount=new ReaderAccount(userAccount.getAccount(),userAccount.getPassword());
                ReaderInfoDetail readerInfoDetail=readerService.selectReaderInfoDetail(userAccount.getAccount());
                String name=readerInfoDetail.getName();
                String idcard=readerInfoDetail.getIdcard();
                String sex;

                if(readerInfoDetail.getSex()==0)sex="男";
                else sex="女";
                map.put("user", readerAccount);
                map.put("infodetail",readerInfoDetail);
                map.put("info",readerService.selectReaderInfo(userAccount.getAccount()));
                map.put("sex",sex);
            }
            return "reader_info.jsp";
        }

    }
}
