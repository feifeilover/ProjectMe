package com.igeekhome.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.service.GradeService;
import com.igeekhome.service.Impl.GradeServiceImpl;

import net.sf.json.JSONObject;

@WebServlet(name = "delete.do", urlPatterns = { "/delete.do" })
public class GradeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//从前端接收数据
		String delIds = request.getParameter("delIds");
		
		//调用业务层
		GradeService service = new GradeServiceImpl();
		int delNums = service.removeGradeByBatch(delIds);
		
		//转换为JSONObject数据
		JSONObject jsonobject = new JSONObject();
		if(delNums > 0) {
			jsonobject.put("success", "true");
			jsonobject.put("delNums", delNums);
		} else {
			jsonobject.put("errorMsg", "数据删除失败!");
		}
		
		//转发给前端
		response.getWriter().print(jsonobject);
		
		
		
		
	}

}
