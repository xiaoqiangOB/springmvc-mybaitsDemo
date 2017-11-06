package chapter8_x.dao;

import org.springframework.stereotype.Repository;

import chapter8_x.entity.StudentCard;
@Repository
public interface StudentCardDao {
	StudentCard findStudentCardByStudentNo(int studentNo);
}