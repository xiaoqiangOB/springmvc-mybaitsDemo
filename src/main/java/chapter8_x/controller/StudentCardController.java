package chapter8_x.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chapter8_x.service.StudentCardService;

@RestController
@RequestMapping("/stucard")
public class StudentCardController {
	@Autowired
	private StudentCardService studentCardService;
}
