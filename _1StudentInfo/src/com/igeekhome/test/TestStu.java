package com.igeekhome.test;

import java.util.List;

import org.junit.Test;

import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;
import com.igeekhome.pojo.User;
import com.igeekhome.service.GradeService;
import com.igeekhome.service.UserService;
import com.igeekhome.service.Impl.GradeServiceImpl;
import com.igeekhome.service.Impl.UserServiceImpl;

public class TestStu {
	@Test
	public void test01() {
		UserService service = new UserServiceImpl();
		User user = service.login("java1234", "123456");
		System.out.println(user);
	}

	@Test
	public void test02() {
		GradeService service = new GradeServiceImpl();
		List<Grade> lists = service.queryAllGrade();
		for (Grade grade : lists) {
			System.out.println(grade);
		}
	}

	@Test
	public void test03() {
		GradeService service = new GradeServiceImpl();
		Paging paging = new Paging(1, 5);
		List<Grade> pages = service.queryGradeByPage(paging);
		System.out.println(pages);
	}
	@Test
	public void test04() {
		GradeService service = new GradeServiceImpl();
		int allCount = service.querytAllCount();
		System.out.println(allCount);
	}
}
