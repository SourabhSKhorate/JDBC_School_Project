package com.school.controller;

import com.school.dto.Teacher;
import java.util.Scanner;

import com.school.service.TeacherService;

public class TestSaveTeacherController {

	public static void main(String[] args) {

		Teacher teacher = new Teacher();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Id");
		int id = sc.nextInt();

		System.out.println("Enter A Name");
		String name = sc.next();

		System.out.println("Enter A Email");
		String email = sc.next();

		teacher.setId(id);
		teacher.setName(name);
		teacher.setEmail(email);

		TeacherService teacherService = new TeacherService();
		Teacher t = teacherService.saveTeacher(teacher);

		if (t != null) {
			System.out.println(teacher.getId() + " Saved Successfully");
		}

	}

}
