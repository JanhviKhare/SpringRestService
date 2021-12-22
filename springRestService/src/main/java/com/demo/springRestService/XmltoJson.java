package com.demo.springRestService;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;

import org.json.XML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
@RestController
public class XmltoJson {
	@Autowired
	private CourseService courseService;
	@PostMapping(path="/studentCourse")
			//consumes ={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
		//  produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})

	public String addCourse(@RequestBody Courses course)
	{
	XmlMapper xml = new XmlMapper();
	String value=  "<student>\r\n"
	+"<id>"+course.getId()+"</id>\r\n"
	+"<name>"+course.getName()+"</name>\r\n"
	+"<discription>"+course.getDiscription()+"</discription>\r\n"
	+"</student>";

	try{
	JsonNode json =xml.readTree(value.getBytes());
	ObjectMapper obj =new ObjectMapper();
	String jsonOut=obj.writeValueAsString(json);
	System.out.println(jsonOut);
	//String op="{\"id\":\""+course.getId()+"\",\"name\":\""+course.getName()+"\",\"desc\":\""+course.getDiscription()+"\"}";
			}catch (IOException e){
	e.printStackTrace();
	}
	return"";
	}




}
