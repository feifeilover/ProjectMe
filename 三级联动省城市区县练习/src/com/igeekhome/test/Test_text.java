package com.igeekhome.test;

import java.util.List;

import org.junit.Test;

import com.igeekhome.pojo.City;
import com.igeekhome.pojo.Province;
import com.igeekhome.service.CityService;
import com.igeekhome.service.ProvinceService;
import com.igeekhome.service.impl.CityServiceImpl;
import com.igeekhome.service.impl.ProvinceServiceImpl;


public class Test_text {
	private ProvinceService provinceService = new ProvinceServiceImpl();
	private CityService cityservice = new CityServiceImpl();
	@Test
	public void test01() {
		List<Province> lists = provinceService.queryAll();
		for (Province province : lists) {
			System.out.println(province);
		}
	}
	
	@Test
	public void test02() {
		List<City> citys = cityservice.queryByCityById(1);
		for (City city : citys) {
			System.out.println(city);
		}
		
	}
}
