package pmb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.StudentTrainingCourse;
import dao.StudentTrainingCourseDAO;

@ViewScoped
@ManagedBean (name = "mbStudentTrainingCourse")
public class MBStudentTrainingCourse {
	
	private List<StudentTrainingCourse> studentTrainingCourseTable;
	private StudentTrainingCourseDAO studentTrainingCourseDAO;
	private StudentTrainingCourse selectedStudentTrainingCourse;
	
	@PostConstruct
	public void init() {
		studentTrainingCourseDAO = new StudentTrainingCourseDAO();
		setStudentTrainingCourseTable(studentTrainingCourseDAO.selectAll());
		selectedStudentTrainingCourse = new StudentTrainingCourse ();
	}
	
	public String updateStudentTrainingCourse ( ) {
		studentTrainingCourseDAO.update(selectedStudentTrainingCourse);
		setStudentTrainingCourseTable(studentTrainingCourseDAO.selectAll());
		return null;
	}
	
	public String removeStudentTrainingCourse ( ) {
		studentTrainingCourseDAO.delete(selectedStudentTrainingCourse.getStudentId());
		setStudentTrainingCourseTable(studentTrainingCourseDAO.selectAll());
		return null;
	}


	public List<StudentTrainingCourse> getStudentTrainingCourseTable() {
		return studentTrainingCourseTable;
	}

	public void setStudentTrainingCourseTable(List<StudentTrainingCourse> studentTrainingCourseTable) {
		this.studentTrainingCourseTable = studentTrainingCourseTable;
	}

	public StudentTrainingCourse getSelectedStudentTrainingCourse() {
		return selectedStudentTrainingCourse;
	}

	public void setSelectedStudentTrainingCourse(StudentTrainingCourse selectedStudentTrainingCourse) {
		this.selectedStudentTrainingCourse = selectedStudentTrainingCourse;
	}

	
	

}
