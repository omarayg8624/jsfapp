package test.dao;

import bean.User_TBL;
import dao.User_TBLDAO;

public class TestUser_TBL {

	public static void main(String[] args) {

		User_TBLDAO dao = new User_TBLDAO();
		int row = 0;

		User_TBL user = new User_TBL();
		user.setFirstName("Omar");
		user.setLastName("Ahmad");
		user.setSex("M");
		user.setCountry("Jordan");
		user.setPassword("12345");
		user.setEmailAddress("omar@gmail.com");
		row = dao.insert(user);
		System.out.println(row + "Inserted");
	}

}
