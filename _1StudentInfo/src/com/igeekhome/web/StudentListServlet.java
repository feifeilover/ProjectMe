package com.igeekhome.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.pojo.Paging;
import com.igeekhome.pojo.Student;
import com.igeekhome.service.StudentService;
import com.igeekhome.service.Impl.StudentServiceImpl;

import net.sf.json.JSONObject;

@WebServlet(name = "student.do", urlPatterns = { "/student.do" })
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//从前端接收数据
		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		
		
		//调用业务层
		StudentService stuService = new StudentServiceImpl();
		int total = stuService.queryStudentByAll();
		Paging paging = new Paging(Integer.parseInt(page), Integer.parseInt(rows));
		List<Student> lists = stuService.queryByPage(paging);
		
		//转为json数据
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("rows", lists);
		jsonObject.put("total", total);
		response.getWriter().print(jsonObject);
	}

}
