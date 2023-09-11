package com.school.controller;

import com.school.service.TeacherService;

public class TestGetAllTeacherController {

	public static void main(String[] args) {

		TeacherService teacherService = new TeacherService();
		teacherService.getAllById(1);

	}

}
