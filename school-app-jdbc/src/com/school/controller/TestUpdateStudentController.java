package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class TestUpdateStudentController {

	public static void main(String[] args) {

		Student student = new Student();
		student.setName("ABC");
		student.setEmail("abc@mail.com");
		student.setId(1);
		StudentService studentService = new StudentService();
		boolean res = studentService.updateStudentById(student);
		System.out.println(res);

	}

}
