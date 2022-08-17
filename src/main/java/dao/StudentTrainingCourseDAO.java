package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Exception;
import java.util.ArrayList;
import java.util.List;

import bean.StudentTrainingCourse;
import database.Database;

public class StudentTrainingCourseDAO {
	
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<StudentTrainingCourse> studentTrainingCourseTable;
	
	public List<StudentTrainingCourse> selectAll() {

		studentTrainingCourseTable = new ArrayList<StudentTrainingCourse>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection
					.prepareStatement("select student_id,course_id,priority from student_Training_Course");
			rs = ps.executeQuery();
			while (rs.next()) {
				StudentTrainingCourse studentTrainingCourse = new StudentTrainingCourse(rs.getInt("student_id"), rs.getInt("course_id"), rs.getInt("priority"));
				studentTrainingCourseTable.add(studentTrainingCourse);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return studentTrainingCourseTable;
	}
	
	

	
	public int insert(StudentTrainingCourse studentTrainingCourse) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into student_Training_Course(student_id, course_id, priority) values(?,?,?)");
			int counter = 1;
			ps.setInt(counter++, studentTrainingCourse.getStudentId());
			ps.setInt(counter++, studentTrainingCourse.getCourseId());
			ps.setInt(counter++, studentTrainingCourse.getPriority());

			

			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}
	
	public int update(StudentTrainingCourse studentTrainingCourse) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("update student_Training_Course set course_id = ?, priority = ? where student_id=?");
			int counter = 1;
			ps.setInt(counter++, studentTrainingCourse.getCourseId());
			ps.setInt(counter++, studentTrainingCourse.getPriority());
			ps.setInt(counter++, studentTrainingCourse.getStudentId());

			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;
	}
	
	public int delete(int id) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("delete from student_Training_Course where student_id = ?");
			ps.setInt(1, id);
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}
		return row;
	}

}
