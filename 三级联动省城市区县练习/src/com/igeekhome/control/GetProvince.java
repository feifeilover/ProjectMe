package com.igeekhome.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.pojo.Province;
import com.igeekhome.service.ProvinceService;
import com.igeekhome.service.impl.ProvinceServiceImpl;

import flexjson.JSONSerializer;

@WebServlet(name = "getPro.do", urlPatterns = { "/getPro.do" })
public class GetProvince extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		//调用业务层数据
		ProvinceService servince = new ProvinceServiceImpl();
		List<Province> lists = servince.queryAll();
		
		//转化成json数据
		JSONSerializer serializer = new JSONSerializer();
		String jsondata = serializer.serialize(lists);
		
		response.getWriter().print(jsondata);
	
	}

}
