package test.dao;
//sat 11-6

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import bean.Dept;
import bean.Emp;
import dao.EmpDAO;

public class TestEmpDAO {

	public static void main(String[] args) {

		EmpDAO dao = new EmpDAO();

		// Calculate Time of the Operation
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		// Date now = newDate();
		// System.out.println(sdf.format(now));

		// Delete
		//int row = dao.delete(100);
		//System.out.println(row + "deleted");

		// Insert
		Emp emp = new Emp();
		emp.setJob("DEV");
		emp.setCommision(10);
		emp.setManager(7788);
		emp.setDept(new Dept(10));
		int row = dao.insert(emp);
		System.out.println(row + "Inserted");

		// Update
		//emp.setName("Omar123");
		//emp.setSalary(1500.0);
		//row = dao.update(emp);
		//System.out.println(row + "updated");

		// SelectAll
		//List<Emp> empTable = dao.selectAll();
		//System.out.println(empTable);

		//List<String> jobTable = dao.selectByJob();
		//System.out.println(jobTable);

	}

}
