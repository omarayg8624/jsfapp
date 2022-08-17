package pmb;

import javax.faces.bean.ManagedBean;

import bean.StudentTrainingCourse;
import dao.StudentTrainingCourseDAO;
import util.Massages;

@ManagedBean (name = "mbAddStudentTrainingCourse")
public class MBAddStudentTrainingCourse {
	
	private StudentTrainingCourse studentTrainingCourse;

	public String save() {
		StudentTrainingCourseDAO studentTrainingCourseDAO = new StudentTrainingCourseDAO();
		int row = studentTrainingCourseDAO.insert(studentTrainingCourse);
		if (row > 0) {
			Massages.addMessageByKey("INFO", "", "msg_stcsave");
		} else {
			Massages.addMessageByKey("INFO", "", "msg_nstcsave");
		}		studentTrainingCourse = new StudentTrainingCourse();
		return null;
	}

	public StudentTrainingCourse getStudentTrainingCourse() {

		if (studentTrainingCourse == null) {
			studentTrainingCourse = new StudentTrainingCourse();
		}

		return studentTrainingCourse;
	}

	public void setStudentTrainingCourse(StudentTrainingCourse studentTrainingCourse) {
		this.studentTrainingCourse = studentTrainingCourse;
	}


}
