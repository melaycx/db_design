package cn.edu.zjut.dao;

import cn.edu.zjut.mapper.BookSubscriptionMapper;
import cn.edu.zjut.po.BookSubscription;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookSubscriptionDAO implements IBookSubscriptionDAO {
    BookSubscriptionMapper bookSubscriptionMapper;
    @Autowired
    public void setBookSubscriptionMapper(BookSubscriptionMapper bookSubscriptionMapper){
        this.bookSubscriptionMapper=bookSubscriptionMapper;
    }
    @Override
    public void insert(cn.edu.zjut.po.BookSubscription bookSubscription){
        bookSubscriptionMapper.insert(bookSubscription);
    }
    @Override
    public List<BookSubscription> querySubscription(){
        return bookSubscriptionMapper.querySubscription();
    }
}
