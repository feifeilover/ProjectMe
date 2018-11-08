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

@WebServlet(name = "edit.do", urlPatterns = { "/edit.do" })
public class GradeEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//接收前端数据
		String gradeName = request.getParameter("gradeName");
		String gradeDesc = request.getParameter("gradeDesc");
		String id = request.getParameter("id");
		System.out.println("编号" + id);
		
		//调用业务层
		GradeService gradeService = new GradeServiceImpl();
		Grade grade = new Grade();
		grade.setGradeName(gradeName);
		grade.setGradeDesc(gradeDesc);
		grade.setId(Integer.parseInt(id));
		int result = gradeService.updateGrade(grade);
		System.out.println("5555");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("zz", result);
		
		//转发给前端
		response.getWriter().print(jsonObject);
		
	}

}
