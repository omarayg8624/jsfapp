package test.dao;

import java.util.List;

import bean.TrainingCourse;
import dao.TrainingCourseDAO;

public class TestTriningCourseDAO {

	public static void main(String[] args) {
		TrainingCourseDAO dao = new TrainingCourseDAO();
		TrainingCourse triningCourse= new TrainingCourse();
		int row = 0;
		
				


//		insert
		triningCourse = new TrainingCourse(1, "جافا", "Java", 10,"Programming in Java","Programming websites using the Java language and linking with the database");
		row = dao.insert(triningCourse);
		System.out.println(row + "Inserted");
		

		
//		select all
		List<TrainingCourse> triningCourseTable = dao.selectAll();
		System.out.println(triningCourseTable);
	}

}
