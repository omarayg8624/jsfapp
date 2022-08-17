package test.dao;

import java.util.List;

import bean.Program;
import dao.ProgramDAO;

public class TestProgramDAO {

	public static void main(String[] args) {
		ProgramDAO dao = new ProgramDAO();
		Program program =new Program();
		int row = 0;
		
//		delete 
//		row = dao.delete(2);
//		System.out.println(row + "deleted");
		
//		insert		
//		program = new Program(2,2, "«·Â‰œ”… «·ﬂÂ—»«∆Ì…", "Electrical Engineering");
//		row = dao.insert(program);
//		System.out.println(row + "Inserted");
		
//		update
		program = new Program(1,1,"«·Â‰œ”… «·’‰«⁄Ì…", "Industrial Engineering");
		row = dao.update(program);
		System.out.println(row + "UpDated");

//		select
//		List<Program> programTable = dao.selectAll();
//		System.out.println(programTable);
	}

}
