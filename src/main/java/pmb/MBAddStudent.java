package pmb;

import javax.faces.bean.ManagedBean;

import bean.Student;
import dao.StudentDAO;
import util.Massages;

@ManagedBean (name = "mbAddStudent")
public class MBAddStudent {
	
	private Student student;

	public String save() {
		StudentDAO studentDAO = new StudentDAO();
		int row = studentDAO.insert(student);
		if (row > 0) {
			Massages.addMessageByKey("INFO", "", "msg_stsave");
		} else {
			Massages.addMessageByKey("INFO", "", "msg_nstsave");
		}		student = new Student();
		return null;
	}

	public Student getStudent() {

		if (student == null) {
			student = new Student();
		}

		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


}
