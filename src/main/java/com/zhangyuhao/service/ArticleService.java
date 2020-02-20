package com.zhangyuhao.service;

import java.util.List;

import com.zhangyuhao.entity.Article;

public interface ArticleService {

	List<Article> list(String dt1, String dt2, String select);

}
