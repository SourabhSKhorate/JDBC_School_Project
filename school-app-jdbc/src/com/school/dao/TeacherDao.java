package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClassTeacher;
import com.school.dto.Student;
import com.school.dto.Teacher;

public class TeacherDao {

	HelperClassTeacher helperClassTeacher = new HelperClassTeacher();
	Connection connection = null;

	// To Add Data into the Table
	public Teacher saveTeacher(Teacher teacher) {

		connection = helperClassTeacher.getConnection();
		String sql = "INSERT INTO teacher VALUES(?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2, teacher.getName());
			preparedStatement.setString(3, teacher.getEmail());

			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return teacher;
	}

	// To Delete Data into the Table
	public boolean deleteTeacherById(int id) {

		connection = helperClassTeacher.getConnection();
		String sql = "DELETE FROM teacher WHERE id=?";
		int i = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	// To Update Data into the Table
	public boolean updateTeacherById(Teacher teacher) {
		connection = helperClassTeacher.getConnection();
		String sql = "UPDATE teacher SET name=? , email= ? WHERE ID=?";
		int i = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	// To GetAll Data into the Table
	public void getAllById(int id) {
		connection = helperClassTeacher.getConnection();
		String sql = "SELECT * FROM teacher WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("====================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
