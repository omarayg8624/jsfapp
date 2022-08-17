package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Exception;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import database.Database;

public class StudentDAO {

	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<Student> studentTable;

	public List<Student> selectAll() {

		studentTable = new ArrayList<Student>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select student_id,student_aname,student_ename,mobile, birthdate, sex, email, university_id, school_id, program_id, final_average, MAX_AVERAGE, rate, graduate_year, graduate_sem from student");
			rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student(rs.getInt("student_id"), rs.getString("student_aname"),
						rs.getString("student_ename"), rs.getString("mobile"), rs.getDate("birthdate"),
						rs.getInt("sex"), rs.getString("email"), rs.getInt("university_id"), rs.getInt("school_id"),
						rs.getInt("program_id"), rs.getDouble("final_average"), rs.getDouble("MAX_AVERAGE"),
						rs.getString("rate"), rs.getInt("graduate_year"), rs.getInt("graduate_sem"));
				studentTable.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return studentTable;
	}

	public List<Integer> selectById() {

		List<Integer> stTable = new ArrayList<Integer>();
		try {
			db = new Database();
			connection = db.getConnection();
			studentTable = new ArrayList<Student>();
			ps = connection.prepareStatement("select distinct student_id from student where student_id is not null order by student_id");
			rs = ps.executeQuery();
			while (rs.next()) {

				stTable.add(rs.getInt("student_id"));
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);

		}
		return stTable;
	}

	public int insert(Student student) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into student(student_id,student_aname,student_ename,mobile, birthdate, sex, email, university_id, school_id, program_id, final_average, MAX_AVERAGE, rate, graduate_year, graduate_sem) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, student.getStudentId());
			ps.setString(counter++, student.geteName());
			ps.setString(counter++, student.getaName());
			ps.setString(counter++, student.getMobile());
			ps.setDate(counter++, new Date(student.getBirthDate().getTime()));
			ps.setInt(counter++, student.getSex());
			ps.setString(counter++, student.getEmail());
			ps.setInt(counter++, student.getUniversityId());
			ps.setInt(counter++, student.getSchoolId());
			ps.setInt(counter++, student.getProgramId());
			ps.setDouble(counter++, student.getFinalAverage());
			ps.setDouble(counter++, student.getMaxAverage());
			ps.setString(counter++, student.getRate());
			ps.setInt(counter++, student.getGraduateYear());
			ps.setInt(counter++, student.getGraduateSem());

			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}

	public int update(Student student) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"update student set student_aname = ?,student_ename = ?,mobile = ?, birthdate = ?, sex, email = ?, university_id = ?, school_id = ?, program_id = ?, final_average = ?, MAX_AVERAGE = ?, rate = ?, graduate_year = ?, graduate_sem = ? where student_id = ?");
			int counter = 1;
			ps.setInt(counter++, student.getStudentId());
			ps.setString(counter++, student.geteName());
			ps.setString(counter++, student.getaName());
			ps.setString(counter++, student.getMobile());
			ps.setDate(counter++, new Date(student.getBirthDate().getTime()));
			ps.setInt(counter++, student.getSex());
			ps.setString(counter++, student.getEmail());
			ps.setInt(counter++, student.getUniversityId());
			ps.setInt(counter++, student.getSchoolId());
			ps.setInt(counter++, student.getProgramId());
			ps.setDouble(counter++, student.getFinalAverage());
			ps.setDouble(counter++, student.getMaxAverage());
			ps.setString(counter++, student.getRate());
			ps.setInt(counter++, student.getGraduateYear());
			ps.setInt(counter++, student.getGraduateSem());

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
			ps = connection.prepareStatement("delete from student where student_id = ?");
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
