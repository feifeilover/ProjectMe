package com.igeekhome.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;
import com.igeekhome.service.GradeService;
import com.igeekhome.service.Impl.GradeServiceImpl;

import net.sf.json.JSONObject;


@WebServlet("/grade.do")
public class GradeListServlet extends HttpServlet{
	private static final long serialVersionUID = -3481649862294780157L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//接受前端数据
		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		String gradeName = request.getParameter("gradeName");
		
		//调用业务层
		GradeService gradeService = new GradeServiceImpl();
		/*Paging paging = new Paging(Integer.parseInt(page), Integer.parseInt(rows));
		List<Grade> grades = gradeService.queryGradeByPage(paging);*/
		int total = gradeService.querytAllCount();  //总记录数
		
		//调用分页+模糊查询的业务层
		Paging paging = new Paging(Integer.parseInt(page), Integer.parseInt(rows));
		Grade grade = new Grade();
		grade.setGradeName(gradeName);
		List<Grade> grades = gradeService.queryGradeByPageAndName(paging, grade);
		
		
		//装入jsonObject中
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("rows", grades);
		jsonobject.put("total", total);
		//System.out.println("装入的数据" + jsonobject);
		response.getWriter().print(jsonobject);
		
	}
}
