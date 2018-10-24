package com.igeekhome.service;

import java.util.List;

import com.igeekhome.pojo.City;

public interface CityService {
	public List<City> queryByCityById(int pid);
}
