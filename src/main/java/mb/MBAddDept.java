package mb;

import javax.faces.bean.ManagedBean;

import bean.Dept;
import dao.DeptDAO;
import util.Massages;

@ManagedBean(name = "mbAddDept")
public class MBAddDept {

	private Dept dept;

	public String save() {
		DeptDAO deptDAO = new DeptDAO();
		deptDAO.insert(dept);
		Massages.addMessageByKey("INFO", "", "msg_dsave");
		dept = new Dept();
		return null;
	}

	public Dept getDept() {

		if (dept == null) {
			dept = new Dept();
		}

		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}
