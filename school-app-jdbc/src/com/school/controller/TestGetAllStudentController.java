package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class TestGetAllStudentController {

	public static void main(String[] args) {

		Student student = new Student();

		StudentService studentService = new StudentService();

		studentService.getAllById(student);

	}

}
