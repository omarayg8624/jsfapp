package test.dao;

import java.util.List;

import bean.StudentResult;
import dao.StudentResultDAO;

public class TestStudentResultDAO {

	public static void main(String[] args) {

			StudentResultDAO dao = new StudentResultDAO();
			StudentResult studentResult= new StudentResult();
			int row = 0;
			
//			delete 
//			row = dao.delete(1);
//			System.out.println(row + "deleted");

//			insert
			studentResult = new StudentResult(1, 1, 90, 90, 1, "yes");
			row = dao.insert(studentResult);
			System.out.println(row + "Inserted");
			
//			update
//			studentResult = new StudentResult(1, 1, 90, 90, 1, "-");
//			row = dao.update(studentResult);
//			System.out.println(row + "UpDated");
			
//			select all
			List<StudentResult> studentResultTable = dao.selectAll();
			System.out.println(studentResultTable);
		}

	}


