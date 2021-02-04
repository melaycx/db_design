package app;

import cn.edu.zjut.app.Application;
import cn.edu.zjut.dao.IViolationDAO;
import cn.edu.zjut.dao.ViolationDAO;
import cn.edu.zjut.mapper.BookFinedMapper;
import cn.edu.zjut.po.*;
import cn.edu.zjut.service.IManagerService;
import cn.edu.zjut.service.IReaderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;

public class SpringEnvTest {
//    @Test
//    public void testICustomerDAO() {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
//        ICustomerDAO userDao = ctx.getBean(ICustomerDAO.class, "userDao");
//        Customer customer = new Customer(1, "wcf", "123456", "wcf",
//                true, new Date(new java.util.Date().getTime()), "17767222000",
//                "wcf@zjut.edu.cn", "zjut", "320000", "1245645");
//        userDao.save(customer);
//    }

    @Test
    public void testIUserService() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");
        List<ReaderInfoDetail> list=managerService.selectAllReader();
        for(ReaderInfoDetail obj:list)
            System.out.println(obj);
    }

    //下面是注册读者
    @Test
    public void testIUserService1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");
        Reader reader=new Reader("18868968595","555555",10,3,6,0,0,"zml",0,"19857186642","zjut","330282199906096938");
        managerService.addReader(reader);
    }
    //下面是删除读者
    @Test
    public void testIUserService2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");

        managerService.deleteReader("812992991");
    }
    //下面是查询违规
    @Test
    public void testIUserService3() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");

        List<Violation> list=managerService.selectAllViolation();
        for(Violation obj:list)
            System.out.println(obj);
        System.out.println("*******************************************");
        System.out.println(managerService.selectViolation("1661834662"));
    }
    //下面是查询历史借书记录
    @Test
    public void testIUserService4() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");

        List<BRRecord> list=managerService.selectAllRecord();
        for(BRRecord obj:list)
            System.out.println(obj);
        System.out.println("*******************************************");
        System.out.println(managerService.selectRecord("1533144693"));
    }
    //下面是查询图书信息
    @Test
    public void testIUserService5() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");

        List<BookInfo> list=managerService.selectAllBook();
        for(BookInfo obj:list)
            System.out.println(obj);
        System.out.println("*******************************************");
        System.out.println(managerService.selectBook("原则"));
    }
    //下面是查询booklist
    @Test
    public void testIUserService6() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");

        List<BookList> list=managerService.selectBookList();
        for(BookList obj:list)
            System.out.println(obj);
    }
    @Test
    public void testIUserService7() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IManagerService managerService=ctx.getBean(IManagerService.class,"managerService");
        List<BookInfo> list=managerService.selectAllBook();
        for(BookInfo obj:list)
        System.out.println(obj);
    }
    @Test
    public void testIUserService8() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        IReaderService readerService=ctx.getBean(IReaderService.class,"readerService");
        Date now=new Date();
        java.sql.Date date=new java.sql.Date(now.getTime());
        readerService.delete(1,date);

    }
}
