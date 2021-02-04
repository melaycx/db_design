package cn.edu.zjut.controller;

import cn.edu.zjut.po.Violation;
import cn.edu.zjut.po.ViolationVO;
import cn.edu.zjut.service.IManagerService;
import cn.edu.zjut.service.IReaderService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class Violation0 {
    IReaderService readerService;
    IManagerService managerService;
    @Autowired
    public void setManagerService(IManagerService managerService){this.managerService=managerService;}
    @Autowired
    public void setReaderService(IReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping("/readerviolation")
    @ResponseBody
    String query(@RequestParam(value = "account") String account) {
        ViolationVO violationVO = new ViolationVO();
        violationVO.setCode("0");
        violationVO.setMsg("");
        List<Violation> list = readerService.selectViolation(account);
        violationVO.setCount(list.size());
        violationVO.setData(list);
        return new Gson().toJson(violationVO);
    }
    @RequestMapping("/violation")
    @ResponseBody
    String query1() {
        ViolationVO violationVO = new ViolationVO();
        violationVO.setCode("0");
        violationVO.setMsg("");
        List<Violation> list = managerService.selectAllViolation();
        violationVO.setCount(list.size());
        violationVO.setData(list);
        return new Gson().toJson(violationVO);
    }
}
