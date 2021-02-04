package cn.edu.zjut.app;

import cn.edu.zjut.dao.*;
import cn.edu.zjut.mapper.*;
import cn.edu.zjut.po.BookList;
import cn.edu.zjut.po.BookLostDamage;
import cn.edu.zjut.po.BookSubscription;
import cn.edu.zjut.service.IManagerService;
import cn.edu.zjut.service.IReaderService;
import cn.edu.zjut.service.ManagerService;
import cn.edu.zjut.service.ReaderService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Application {

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://121.196.103.192:3306/db_design?useUnicode=true&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        SqlSessionFactory factory = factoryBean.getObject();
        assert factory != null;
        factory.getConfiguration().addMapper(ReaderInfoDetailMapper.class);
        factory.getConfiguration().addMapper(ReaderAccountMapper.class);
        factory.getConfiguration().addMapper(ReaderInfoMapper.class);
        factory.getConfiguration().addMapper(ViolationMapper.class);
        factory.getConfiguration().addMapper(BRRecordMapper.class);
        factory.getConfiguration().addMapper(BookInfoMapper.class);
        factory.getConfiguration().addMapper(BookListMapper.class);
        factory.getConfiguration().addMapper(BookSubscriptionMapper.class);
        factory.getConfiguration().addMapper(BookLostDamageMapper.class);
        factory.getConfiguration().addMapper(BookFinedMapper.class);
        factory.getConfiguration().addMapper(BookCanceledMapper.class);
        factory.getConfiguration().addMapper(ManagerAccountMapper.class);
        factory.getConfiguration().addMapper(ReaderMapper.class);
        return factory;
    }
    @Bean
    public ReaderMapper readerMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(ReaderMapper.class);
    }

    @Bean
    public ReaderInfoDetailMapper readerInfoDetailMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(ReaderInfoDetailMapper.class);
    }

    @Bean
    public IReaderInfoDetailDAO readerInfoDetailDAO() {
        return new ReaderInfoDetailDAO();
    }

    @Bean
    public ReaderAccountMapper readerAccountMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(ReaderAccountMapper.class);
    }

    @Bean
    public IReaderAccountDAO readerAccountDAO() {
        return new ReaderAccountDAO();
    }

    @Bean
    public ReaderInfoMapper readerInfoMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(ReaderInfoMapper.class);
    }

    @Bean
    public IReaderInfoDAO readerInfoDAO() {
        return new ReaderInfoDAO();
    }

    @Bean
    public ViolationMapper violationMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(ViolationMapper.class);
    }

    @Bean
    public IViolationDAO violationDAO() {
        return new ViolationDAO();
    }

    @Bean
    public BRRecordMapper brRecordMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(BRRecordMapper.class);
    }

    @Bean
    public IBRRecordDAO brRecordDAO() {
        return new BRRecordDAO();
    }

    @Bean
    public BookInfoMapper bookInfoMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(BookInfoMapper.class);
    }

    @Bean
    public IBookInfoDAO bookInfoDAO() {
        return new BookInfoDAO();
    }

    @Bean
    public BookListMapper bookListMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(BookListMapper.class);
    }

    @Bean
    public IBookListDAO bookListDAO() {
        return new BookListDAO();
    }

    @Bean
    public BookSubscriptionMapper bookSubscriptionMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(BookSubscriptionMapper.class);
    }

    @Bean
    public IBookSubscriptionDAO bookSubscriptionDAO() {
        return new BookSubscriptionDAO();
    }

    @Bean
    public BookLostDamageMapper bookLostDamageMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(BookLostDamageMapper.class);
    }

    @Bean
    public IBookLostDamageDAO bookLostDamageDAO() {
        return new BookLostDamageDAO();
    }

    @Bean
    public BookFinedMapper bookFinedMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(BookFinedMapper.class);
    }

    @Bean
    public IBookFinedDAO bookFinedDAO() {
        return new BookFinedDAO();
    }

    @Bean
    public BookCanceledMapper bookCanceledMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(BookCanceledMapper.class);
    }

    @Bean
    public IBookCanceledDAO bookCanceledDAO() {
        return new BookCanceledDAO();
    }

    @Bean
    ManagerAccountMapper managerAccountMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(ManagerAccountMapper.class);
    }

    @Bean
    public IManagerService managerService() {
        return new ManagerService();
    }

    @Bean
    public IReaderService readerService() {
        return new ReaderService();
    }

}
