package com.school.controller;

import com.school.service.TeacherService;

public class TestDeleteTeacherController {

	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.deleteTeacherById(2);
		System.out.println(res);

	}

}
