package pmb;

import javax.faces.bean.ManagedBean;

import bean.StudentResult;
import dao.StudentResultDAO;
import util.Massages;

@ManagedBean (name = "mbAddStudentResult")
public class MBAddStudentResult {
	
	private StudentResult studentResult;

	public String save() {
		StudentResultDAO studentResultDAO = new StudentResultDAO();
		int row = studentResultDAO.insert(studentResult);
		if (row > 0) {
			Massages.addMessageByKey("INFO", "", "msg_strsave");
		} else {
			Massages.addMessageByKey("INFO", "", "msg_nstrsave");
		}		studentResult = new StudentResult();
		return null;
	}

	public StudentResult getStudentResult() {

		if (studentResult == null) {
			studentResult = new StudentResult();
		}

		return studentResult;
	}

	public void setStudentResult(StudentResult studentResult) {
		this.studentResult = studentResult;
	}


}
