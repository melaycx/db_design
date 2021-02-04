package cn.edu.zjut.dao;

import cn.edu.zjut.po.BookSubscription;

import java.util.List;

public interface IBookSubscriptionDAO {
    void insert(BookSubscription bookSubscription);
    List<BookSubscription> querySubscription();
}
