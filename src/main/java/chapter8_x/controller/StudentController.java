package chapter8_x.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import chapter8_x.entity.Student;
import chapter8_x.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/getStudent.do",method=RequestMethod.POST)
	public String getStudent(@RequestBody Map map) {
		Gson gson = new Gson();
		Student stu = studentService.getStu(Integer.parseInt((String) map.get("id")));
		return gson.toJson(stu);
	}
	@ResponseBody
	@RequestMapping(value = "/getStu.do",method=RequestMethod.GET)
	public Student getStudent(Integer id) {
		return studentService.getStu(id);
	}
}

