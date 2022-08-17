package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

import bean.User_TBL;
import database.Database;

public class User_TBLDAO {

	private int row = 0;
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public int insert(User_TBL user) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into User_TBL (user_id, first_name, last_name, sex, birthdate, email, country, pwd, sal, mobile) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			int counter = 1;
			ps.setString(counter++, user.getFirstName());
			ps.setString(counter++, user.getLastName());
			ps.setString(counter++, user.getSex());
			ps.setString(counter++, user.getEmailAddress());
			ps.setDate(counter++, (Date) user.getBirthDate());
			ps.setString(counter++, user.getCountry());
			ps.setString(counter++, user.getPassword());
			ps.setDouble(counter++, user.getExpectedSalary());
			ps.setString(counter++, user.getMobile());

			

			row = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(connection);
			Database.close(ps);
		}

		return row;

	}

	public User_TBL selectByEmail(String emailAddress, String password) {
		User_TBL user = null;

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("select USER_ID, FIRST_NAME, LAST_NAME, SEX, BIRTHDATE, COUNTRY, EMAIL, PWD, SAL, MOBILE from User_TBL");
			ps.setString(1, emailAddress);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				
				user.setUserId(rs.getInt("USER_ID"));
				user.setFirstName(rs.getString("FIRST_NAME"));
				user.setLastName(rs.getString("LAST_NAME"));
				user.setSex(rs.getString("SEX"));
				user.setBirthDate(rs.getDate("BIRTHDATE"));
				user.setCountry(rs.getString("COUNTRY"));
				user.setEmailAddress(rs.getString("EMAIL"));
				user.setPassword(rs.getString("PWD"));
				user.setExpectedSalary(rs.getDouble("SAL"));
				user.setMobile(rs.getString("mobile"));
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return user;

	}
}
