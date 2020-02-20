package com.zhangyuhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangyuhao.dao.ArticleMapper;
import com.zhangyuhao.entity.Article;
import com.zhangyuhao.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleMapper mapper;
	
	
	@Override
	public List<Article> list(String dt1, String dt2,String select) {
			return 	mapper.list(dt1, dt2, select);
		
		
	}

}
