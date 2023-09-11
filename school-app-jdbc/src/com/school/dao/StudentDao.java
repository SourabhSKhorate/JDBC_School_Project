package com.school.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClassStudent;
import com.school.dto.Student;

public class StudentDao {
	HelperClassStudent helperclass = new HelperClassStudent();
	Connection connection = null;

	// To Add Data into the Table
	public Student saveStudent(Student student) {
		connection = helperclass.getConnection();
		// ? is placeholder
		String sql = "INSERT INTO student VALUES(?,?,?)";

		try {
			// Create a Statement to insert data into placeholder
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());

			// execute
			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// close connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}

	// To Delete Data into the Table
	public boolean deleteStudentByID(int id) {
		connection = helperclass.getConnection();
		int n = 0;

		String sql = "DELETE FROM student WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			n = preparedStatement.executeUpdate();

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
		if (n > 0) {
			return true;
		} else {
			return false;
		}
	}

	// To Update Data into the Table
	public boolean updateStudentById(Student student) {
		connection = helperclass.getConnection();
		String sql = "UPDATE student SET name=?, email=? WHERE id=?";
		int i = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setInt(3, student.getId());

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
	public Student getAllById(Student student) {
		connection = helperclass.getConnection();
		String sql = "SELECT * FROM student";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("=================================");
			}

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
		return student;
	}

}
