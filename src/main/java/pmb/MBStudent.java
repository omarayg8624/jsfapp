package pmb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.Student;
import dao.StudentDAO;
@ViewScoped
@ManagedBean (name = "mbStudent")
public class MBStudent {
		
		private List<Student> studentTable;
		private StudentDAO studentDAO;
		private Student selectedStudent;
		private List<Integer> stTable;

		@PostConstruct
		public void init() {
			studentDAO = new StudentDAO();
			stTable = studentDAO.selectById();
			setStudentTable(studentDAO.selectAll());
			selectedStudent = new Student ();
		}
		
		public String updateStudent ( ) {
			studentDAO.update(selectedStudent);
			setStudentTable(studentDAO.selectAll());
			return null;
		}
		
		public String removeStudent ( ) {
			studentDAO.delete(selectedStudent.getStudentId());
			setStudentTable(studentDAO.selectAll());
			return null;
		}

		public Student getSelectedStudent() {
			return selectedStudent;
		}

		public void setSelectedStudent(Student selectedStudent) {
			this.selectedStudent = selectedStudent;
		}

		public List<Student> getStudentTable() {
			return studentTable;
		}

		public void setStudentTable(List<Student> studentTable) {
			this.studentTable = studentTable;
		}

		public List<Integer> getStTable() {
			return stTable;
		}

		public void setStTable(List<Integer> stTable) {
			this.stTable = stTable;
		}


}
