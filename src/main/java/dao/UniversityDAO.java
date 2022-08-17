package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.University;
import database.Database;

public class UniversityDAO {
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<University> universityTable;

	///////////////////////////////////////////////////////////////

	public List<University> selectAll() {

		universityTable = new ArrayList<University>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection
					.prepareStatement("select university_id,university_aname,university_ename,website from university");
			rs = ps.executeQuery();
			while (rs.next()) {
				University university = new University(rs.getInt("university_id"), rs.getString("university_aname"),
						rs.getString("university_ename"), rs.getString("website"));
				universityTable.add(university);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return universityTable;
	}

	public List<Integer> selectById() {

		List<Integer> unTable = new ArrayList<Integer>();
		try {
			db = new Database();
			connection = db.getConnection();
			universityTable = new ArrayList<University>();
			ps = connection.prepareStatement(
					"select distinct university_id from university where university_id is not null order by university_id");
			rs = ps.executeQuery();
			while (rs.next()) {

				unTable.add(rs.getInt("university_id"));
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);

		}
		return unTable;
	}

	///////////////////////////////////////////////////////////////

	public int insert(University university) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into university(university_id,university_aname,university_ename,website) values(?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, university.getUniverstyId());
			ps.setString(counter++, university.getaName());
			ps.setString(counter++, university.geteName());
			ps.setString(counter++, university.getWebsite());

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

	public int update(University university) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"update university set university_aname = ?, university_ename = ?, website = ? where university_id=?");
			int counter = 1;
			ps.setString(counter++, university.getaName());
			ps.setString(counter++, university.geteName());
			ps.setString(counter++, university.getWebsite());
			ps.setInt(counter++, university.getUniverstyId());

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
			ps = connection.prepareStatement("delete from university where university_id = ?");
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
