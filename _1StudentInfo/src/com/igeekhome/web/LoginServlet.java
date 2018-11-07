package com.igeekhome.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.pojo.User;
import com.igeekhome.service.UserService;
import com.igeekhome.service.Impl.UserServiceImpl;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 3783226212277210181L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		//从前端接收数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//调用业务层
		UserService userService = new UserServiceImpl();
		User user = userService.login(username, password);
		if(user == null) {
			request.setAttribute("error", "用户名密码不正确");
			request.getRequestDispatcher("login.jsp").forward(request, response);;
		} else {
			request.getSession().setAttribute("currUser", user);
			response.sendRedirect("main.jsp");
		}
	}
}
