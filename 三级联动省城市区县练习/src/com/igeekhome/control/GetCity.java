package com.igeekhome.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.pojo.City;
import com.igeekhome.service.CityService;
import com.igeekhome.service.impl.CityServiceImpl;

import flexjson.JSONSerializer;

@WebServlet("/getCity.do")
public class GetCity extends HttpServlet{

	private static final long serialVersionUID = -6955943436863993519L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		String pid = request.getParameter("pid");//前台接受数据
		
		//调用业务层数据
		CityService cityservice = new CityServiceImpl();
		List<City> cities = cityservice.queryByCityById(Integer.parseInt(pid));
		
		//转化成json数据
		JSONSerializer serializer = new JSONSerializer();
		String jsondata = serializer.serialize(cities);
		
		//输出
		response.getWriter().print(jsondata);
	}
}
