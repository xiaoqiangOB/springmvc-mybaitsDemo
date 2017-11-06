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
	//��������ʱ�� ���ø�����Ϊ��д�ύ�Ĳ�� ������ΪΪ����������֧�� ���û�оͲ�����
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.SUPPORTS)
	public Student getStu(Integer id) {
		return studentDao.getStudent(id);
	}
	//���ø�����Ϊ��д�ύ�Ĳ㼶 ������ΪΪ�����ǰ�Ѿ����������� �ͼ��뵱ǰ����
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public int updateStu(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
