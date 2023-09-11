package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TestUpdateTeacherController {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("pqr");
		teacher.setEmail("pqr@mail.com");
		teacher.setId(3);

		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.updateTeacherById(teacher);
		System.out.println(res);

	}

}
