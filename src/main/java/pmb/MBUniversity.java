package pmb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.University;
import dao.UniversityDAO;
import report.Report;

@ViewScoped
@ManagedBean(name = "mbUniversity")
public class MBUniversity {

	private List<University> universityTable;
	private UniversityDAO universityDAO;
	private University selectedUniversity;
	private List<Integer> unTable;

	@PostConstruct
	public void init() {
		universityDAO = new UniversityDAO();
		unTable = universityDAO.selectById();
		setUniversityTable(universityDAO.selectAll());
		selectedUniversity = new University();
	}

	public String updateUniversity() {
		universityDAO.update(selectedUniversity);
		setUniversityTable(universityDAO.selectAll());
		return null;
	}

	public String removeUniversity() {
		universityDAO.delete(selectedUniversity.getUniverstyId());
		setUniversityTable(universityDAO.selectAll());
		return null;
	}

	public String runUniversityReport() throws Exception {

		Report report = new Report();
		report.runPdf("University.jasper", null);

		return null;
	}

	public University getSelectedUniversity() {
		return selectedUniversity;
	}

	public void setSelectedUniversity(University selectedUniversity) {
		this.selectedUniversity = selectedUniversity;
	}

	public List<University> getUniversityTable() {
		return universityTable;
	}

	public void setUniversityTable(List<University> universityTable) {
		this.universityTable = universityTable;
	}

	public List<Integer> getUnTable() {
		return unTable;
	}

	public void setUnTable(List<Integer> unTable) {
		this.unTable = unTable;
	}

}
