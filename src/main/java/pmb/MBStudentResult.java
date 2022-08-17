package pmb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.StudentResult;
import dao.StudentResultDAO;

@ViewScoped
@ManagedBean(name = "mbStudentResult")
public class MBStudentResult {

	private List<StudentResult> studentResultTable;
	private StudentResultDAO studentResultDAO;
	private StudentResult selectedStudentResult;

	@PostConstruct
	public void init() {
		studentResultDAO = new StudentResultDAO();
		setStudentResultTable(studentResultDAO.selectAll());
		selectedStudentResult = new StudentResult();
	}

	public String updateStudentResult() {
		studentResultDAO.update(selectedStudentResult);
		setStudentResultTable(studentResultDAO.selectAll());
		return null;
	}

	public String removeStudentResult() {
		studentResultDAO.delete(selectedStudentResult.getStudentId());
		setStudentResultTable(studentResultDAO.selectAll());
		return null;
	}

	public List<StudentResult> getStudentResultTable() {
		return studentResultTable;
	}

	public void setStudentResultTable(List<StudentResult> studentResultTable) {
		this.studentResultTable = studentResultTable;
	}

	public StudentResult getSelectedStudentResult() {
		return selectedStudentResult;
	}

	public void setSelectedStudentResult(StudentResult selectedStudentResult) {
		this.selectedStudentResult = selectedStudentResult;
	}

}
