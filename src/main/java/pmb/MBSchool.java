package pmb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.School;
import dao.SchoolDAO;
import report.Report;

@ViewScoped
@ManagedBean(name = "mbSchool")
public class MBSchool {

	private List<School> schoolTable;
	private SchoolDAO schoolDAO;
	private School selectedSchool;
	private List<Integer> scTable;

	@PostConstruct
	public void init() {
		schoolDAO = new SchoolDAO();
		scTable = schoolDAO.selectById();
		setSchoolTable(schoolDAO.selectAll());
		selectedSchool = new School();
	}

	public String updateSchool() {
		schoolDAO.update(selectedSchool);
		setSchoolTable(schoolDAO.selectAll());
		return null;
	}

	public String removeSchool() {
		schoolDAO.delete(selectedSchool.getSchoolId());
		setSchoolTable(schoolDAO.selectAll());
		return null;
	}
	
	public String runSchoolReport() throws Exception {

		Report report = new Report();
		report.runPdf("School.jasper", null);

		return null;
	}

	public List<School> getSchoolTable() {
		return schoolTable;
	}

	public void setSchoolTable(List<School> schoolTable) {
		this.schoolTable = schoolTable;
	}

	public School getSelectedSchool() {
		return selectedSchool;
	}

	public void setSelectedSchool(School selectedSchool) {
		this.selectedSchool = selectedSchool;
	}

	public List<Integer> getScTable() {
		return scTable;
	}

	public void setScTable(List<Integer> scTable) {
		this.scTable = scTable;
	}

}
