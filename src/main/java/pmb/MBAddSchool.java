package pmb;

import javax.faces.bean.ManagedBean;


import bean.School;
import dao.SchoolDAO;
import util.Massages;

@ManagedBean (name = "mbAddSchool")
public class MBAddSchool {
	
	private School school;

	public String save() {
		SchoolDAO schoolDAO = new SchoolDAO();
		int row = schoolDAO.insert(school);
		if (row > 0) {
			Massages.addMessageByKey("INFO", "", "msg_ssave");
		} else {
			Massages.addMessageByKey("INFO", "", "msg_nssave");
		}
		school = new School();
		return null;
	}

	public School getSchool() {

		if (school == null) {
			school = new School();
		}

		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
	


