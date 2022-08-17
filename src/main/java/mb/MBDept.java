package mb;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.Dept;
import dao.DeptDAO;
import report.Report;

@ViewScoped
@ManagedBean(name = "mbDept")
public class MBDept {

	private List<Dept> deptTable;
	private DeptDAO deptDAO;
	private Dept selectedDept;

	@PostConstruct
	public void init() {
		deptDAO = new DeptDAO();
		deptTable = deptDAO.selectAll();
		selectedDept = new Dept ();
	}
	
	public String updateDept ( ) {
		deptDAO.update(selectedDept);
		deptTable = deptDAO.selectAll();
		return null;
	}
	
	public String removeDept ( ) {
		deptDAO.delete(selectedDept.getId());
		deptTable = deptDAO.selectAll();
		return null;
	}
	
	public String runDeptReport () throws Exception {
		
		Report report = new Report ();
		report.runPdf("Emp-Per-Dept.jasper", null);
		
		return null;
	}

	public List<Dept> getDeptTable() {
		return deptTable;
	}

	public void setDeptTable(List<Dept> deptTable) {
		this.deptTable = deptTable;
	}

	public Dept getSelectedDept() {
		return selectedDept;
	}

	public void setSelectedDept(Dept selectedDept) {
		this.selectedDept = selectedDept;
	}

}
