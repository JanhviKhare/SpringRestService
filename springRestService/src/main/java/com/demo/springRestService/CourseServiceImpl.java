package com.demo.springRestService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
	List <Courses>list;
	public CourseServiceImpl(){
	list=new ArrayList<>();
	}

	@Override
	public String addCourse(Courses course) {
		
		return "";
	}

}
