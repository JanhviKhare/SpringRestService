package com.demo.springRestService;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonToXml {
	@Autowired
	private CourseService courseService;
	@PostMapping(path="/course")
	public String addCourse(@RequestBody Courses course)
	{
		this.courseService.addCourse(course);
		JSONObject jsonObj= new JSONObject(course);
		System.out.println(XML.toString(jsonObj));
		return this.courseService.addCourse(course);
	}

}
