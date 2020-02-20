package com.zhangyuhao.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangyuhao.entity.Article;
import com.zhangyuhao.service.ArticleService;

@Controller
public class ArticlerController {

	@Autowired
	ArticleService service;
	
	
	@RequestMapping("list")
	public Object list(HttpServletRequest request,String dt1,String dt2,String select){
		List<Article> list = service.list(dt1,dt2,select);
		System.out.println(select);
		request.setAttribute("list", list);
		request.setAttribute("dt1", dt1);
		request.setAttribute("dt2", dt2);
		return "list";
	}
}
