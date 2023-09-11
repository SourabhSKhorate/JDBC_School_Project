package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {

	StudentDao studentdao = new StudentDao();

	public Student saveStudent(Student student) {
		Student s = studentdao.saveStudent(student);
		return s;
	}

	public boolean deleteStudentByID(int id) {
		return studentdao.deleteStudentByID(id);
	}

	public boolean updateStudentById(Student student) {
		return studentdao.updateStudentById(student);
	}

	public Student getAllById(Student student) {
		return studentdao.getAllById(student);
	}
}
