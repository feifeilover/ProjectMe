package com.igeekhome.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.pojo.Grade;
import com.igeekhome.service.GradeService;
import com.igeekhome.service.Impl.GradeServiceImpl;

import net.sf.json.JSONObject;

@WebServlet(name = "add.do", urlPatterns = { "/add.do" })
public class GradeAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//从前端接收数据
		String gradeName = request.getParameter("gradeName");
		String gradeDesc = request.getParameter("gradeDesc");
		
		//调用业务层
		GradeService service = new GradeServiceImpl();
		Grade grade = new Grade();
		grade.setGradeName(gradeName);
		grade.setGradeDesc(gradeDesc);
		int result = service.addGrade(grade);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("tt", result);
		response.getWriter().print(jsonObject);
	}

}
