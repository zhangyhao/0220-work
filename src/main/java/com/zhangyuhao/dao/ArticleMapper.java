package com.zhangyuhao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangyuhao.entity.Article;

public interface ArticleMapper {

	List<Article> list(@Param("dt1")String dt1,@Param("dt2")String dt2,@Param("select")String select);

	List<Article> list1(@Param("dt1")String dt1,@Param("dt2") String dt2, @Param("select")String select);

}
