package chapter8_x.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import chapter8_x.dao.StudentDao;
import chapter8_x.entity.Student;
import chapter8_x.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	//运行它的时候 采用隔离性为读写提交的层次 传播行为为如果有事物就支持 如果没有就不开启
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.SUPPORTS)
	public Student getStu(Integer id) {
		return studentDao.getStudent(id);
	}
	//采用隔离性为读写提交的层级 传播行为为如果当前已经开启了事物 就加入当前事务
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public int updateStu(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
