package com.igeekhome.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.pojo.County;
import com.igeekhome.service.CountyService;
import com.igeekhome.service.impl.CountyServiceImpl;

import flexjson.JSONSerializer;

@WebServlet("/getcounty.do")
public class GetCounty extends HttpServlet{
	private static final long serialVersionUID = -7520951874678746556L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		String qid = request.getParameter("qid");
		
		CountyService countyservice = new CountyServiceImpl();
		List<County> lists = countyservice.queryCountyById(Integer.parseInt(qid));
		
		JSONSerializer serialize = new JSONSerializer();
		String jsondata = serialize.serialize(lists);
		
		response.getWriter().print(jsondata);
	
	}
}
