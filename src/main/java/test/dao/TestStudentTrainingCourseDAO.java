package test.dao;

import java.util.List;

import bean.StudentTrainingCourse;
import dao.StudentTrainingCourseDAO;

public class TestStudentTrainingCourseDAO {

	public static void main(String[] args) {

		StudentTrainingCourseDAO dao = new StudentTrainingCourseDAO();
		StudentTrainingCourse studentTrainingCourse= new StudentTrainingCourse();
		int row = 0;
		
//		delete 
//		row = dao.delete(2);
//		System.out.println(row + "deleted");

//		insert
		studentTrainingCourse = new StudentTrainingCourse(1, 1, 1);
		row = dao.insert(studentTrainingCourse);
		System.out.println(row + "Inserted");
		
//		update
//		studentTrainingCourse = new StudentTrainingCourse(1, 1, 2);
//		row = dao.update(studentTrainingCourse);
//		System.out.println(row + "UpDated");
		
//		select all
		List<StudentTrainingCourse> studentTrainingCourseTable = dao.selectAll();
		System.out.println(studentTrainingCourseTable);
	}
	}


