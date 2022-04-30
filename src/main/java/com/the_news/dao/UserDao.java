package com.the_news.dao;

import com.the_news.entity.Category;
import com.the_news.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    // 根据 id 寻找对应的 User
    //User findUserById(int id);

    //查询所有新闻类型
    List<Category> findAllcategory();

    //查询所有新闻
    List<News> findAllNews();

    //根据新闻类型查询新闻
    List<News> allNewsByCid(int cid);

    //根据新闻id查询新闻
    News findNewsById(int id);

    //根据新闻标题查询新闻
    List<News> findNewsByTitle(@Param(value="title")String title);
}
