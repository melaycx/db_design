package cn.edu.zjut.mapper;

import cn.edu.zjut.po.BookSubscription;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookSubscriptionMapper {
    @Insert("insert into book_subscription(isbn, amount, subscription_time, unit_price, operator) values (#{isbn}, #{amount}, #{subscription_time}, #{unit_price}, #{operator})")
    void insert(BookSubscription bookSubscription);
    @Select("select * from book_subscription")
    List<BookSubscription> querySubscription();
}
