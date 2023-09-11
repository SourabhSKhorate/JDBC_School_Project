package com.school.service;

import com.school.dao.TeacherDao;

import com.school.dto.Teacher;

public class TeacherService {

	TeacherDao teacherdao = new TeacherDao();

	public Teacher saveTeacher(Teacher teacher) {
		return teacherdao.saveTeacher(teacher);
	}

	public boolean deleteTeacherById(int id) {
		return teacherdao.deleteTeacherById(id);
	}

	public boolean updateTeacherById(Teacher teacher) {
		return teacherdao.updateTeacherById(teacher);
	}

	public void getAllById(int id) {
		teacherdao.getAllById(id);
	}

}
