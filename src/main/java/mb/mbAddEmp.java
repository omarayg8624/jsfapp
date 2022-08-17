package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import bean.Dept;
import bean.Emp;
import dao.DeptDAO;
import dao.EmpDAO;
import util.Massages;

@ManagedBean(name = "mbAddEmp")
public class mbAddEmp {

	private List<String> jobTable;
	private List<Dept> deptTable;
	private Emp emp;
	private EmpDAO empDAO;

	@PostConstruct
	public void init() {
		empDAO = new EmpDAO();
		jobTable = empDAO.selectByJob();
		DeptDAO deptDAO = new DeptDAO();
		deptTable = deptDAO.selectAll();
		
		System.out.println(deptTable);
		System.out.println(jobTable);
	}

	public String save() {

		empDAO.insert(emp);
		Massages.addMessageByKey("INFO", "", "msg_save");
		emp = new Emp();
		emp.setDept(new Dept());
		return null;
	}

	public Emp getEmp() {
		if (emp == null) {
			emp = new Emp();
			emp.setDept(new Dept());
		}
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public List<String> getJobTable() {
		return jobTable;
	}

	public void setJobTable(List<String> jobTable) {
		this.jobTable = jobTable;
	}

	public List<Dept> getDeptTable() {
		return deptTable;
	}

	public void setDeptTable(List<Dept> deptTable) {
		this.deptTable = deptTable;
	}

}
