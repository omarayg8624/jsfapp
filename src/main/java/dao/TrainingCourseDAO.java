package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Exception;
import java.util.ArrayList;
import java.util.List;

import bean.TrainingCourse;
import database.Database;

public class TrainingCourseDAO {
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<TrainingCourse> trainingCourseTable;

	public List<TrainingCourse> selectAll() {

		trainingCourseTable = new ArrayList<TrainingCourse>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select course_id,course_aname,course_ename,max_students,short_desc,detailed_desc from training_course");
			rs = ps.executeQuery();
			while (rs.next()) {
				TrainingCourse trainingCourse = new TrainingCourse(rs.getInt("course_id"), rs.getString("course_aname"),
						rs.getString("course_ename"), rs.getInt("max_students"), rs.getString("short_desc"),
						rs.getString("detailed_desc"));
				trainingCourseTable.add(trainingCourse);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return trainingCourseTable;
	}
	
	public List<Integer> selectById() {

		List<Integer> trTable = new ArrayList<Integer>();
		try {
			db = new Database();
			connection = db.getConnection();
			trainingCourseTable = new ArrayList<TrainingCourse>();
			ps = connection.prepareStatement("select distinct course_id from training_course where course_id is not null order by course_id");
			rs = ps.executeQuery();
			while (rs.next()) {

				trTable.add(rs.getInt("course_id"));
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);

		}
		return trTable;
	}
	
	/////////////////////////////////////
	public int insert(TrainingCourse trainingCourse) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into TRAINING_COURSE(course_id,course_aname,course_ename,max_students,short_desc,detailed_desc) values(?,?,?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, trainingCourse.getCourseId());
			ps.setString(counter++, trainingCourse.getaName());
			ps.setString(counter++, trainingCourse.geteName());
			ps.setInt(counter++, trainingCourse.getMaxStudent());
			ps.setString(counter++, trainingCourse.getShortdesc());
			ps.setString(counter++, trainingCourse.getDetailedDesc());

			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}
	
	/////////////////////////////

	public int update(TrainingCourse trainingCourse) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("update training_course set course_aname = ?,course_ename = ?,max_students = ?,short_desc = ?,detailed_desc = ? where course_id=?");
			int counter = 1;
			ps.setString(counter++, trainingCourse.getaName());
			ps.setString(counter++, trainingCourse.geteName());
			ps.setInt(counter++, trainingCourse.getMaxStudent());
			ps.setString(counter++, trainingCourse.getShortdesc());
			ps.setString(counter++, trainingCourse.getDetailedDesc());
			ps.setInt(counter++, trainingCourse.getCourseId());

			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;
	}

	/////////////////////////////////////////////

	public int delete(int id) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("delete from training_course where course_id = ?");
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
