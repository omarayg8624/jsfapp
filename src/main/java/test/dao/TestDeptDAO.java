package test.dao;

import java.util.List;

import bean.Dept;
import dao.DeptDAO;

public class TestDeptDAO {

	public static void main(String[] args) {

		DeptDAO dao = new DeptDAO();

		// Delete
		// int row = dao.delete(50);
		// System.out.println(row + "deleted");

		// Insert
		Dept dept = new Dept();
		dept.setName("test nm");
		dept.setLocation("test loc");
		int row = dao.insert(dept);
		System.out.println(row + "inserted");

		// Update
		// dept = new Dept(50, "Dev", "Irbid");
		// row = dao.update(dept);
		// System.out.println(row + "updated");

		// SelectAll
		// List<Dept> deptTable = dao.selectAll();
		// System.out.println(deptTable);

	}

}
