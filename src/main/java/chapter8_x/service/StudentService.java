package chapter8_x.service;

import chapter8_x.entity.Student;

public interface StudentService {
	Student getStu(Integer id);
	
	int updateStu(Student student);
}
