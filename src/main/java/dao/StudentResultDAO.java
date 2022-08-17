package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Exception;
import java.util.ArrayList;
import java.util.List;

import bean.StudentResult;
import database.Database;

public class StudentResultDAO {

	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<StudentResult> studentResultTable;

	public List<StudentResult> selectAll() {

		studentResultTable = new ArrayList<StudentResult>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select student_id,course_id,english_mark,interview_mark,accepted_flag,notes from student_Result");
			rs = ps.executeQuery();
			while (rs.next()) {
				StudentResult studentResult = new StudentResult(rs.getInt("student_id"), rs.getInt("course_id"),
						rs.getInt("english_mark"), rs.getInt("interview_mark"), rs.getInt("accepted_flag"),
						rs.getString("notes"));
				studentResultTable.add(studentResult);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return studentResultTable;
	}

	public int insert(StudentResult studentResult) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into student_Result(student_id,course_id,english_mark,interview_mark,accepted_flag,notes) values(?,?,?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, studentResult.getStudentId());
			ps.setInt(counter++, studentResult.getCourseId());
			ps.setInt(counter++, studentResult.getEnglishMark());
			ps.setInt(counter++, studentResult.getInterviewMark());
			ps.setInt(counter++, studentResult.getAcceptedFlag());
			ps.setString(counter++, studentResult.getNotes());

			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}

	public int update(StudentResult studentResult) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("update student_result set course_id = ?,english_mark = ?,interview_mark = ?,accepted_flag = ?,notes = ? where student_id=?");
			int counter = 1;
			ps.setInt(counter++, studentResult.getCourseId());
			ps.setInt(counter++, studentResult.getEnglishMark());
			ps.setInt(counter++, studentResult.getInterviewMark());
			ps.setInt(counter++, studentResult.getAcceptedFlag());
			ps.setString(counter++, studentResult.getNotes());
			ps.setInt(counter++, studentResult.getStudentId());

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
			ps = connection.prepareStatement("delete from student_Result where student_id = ?");
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
