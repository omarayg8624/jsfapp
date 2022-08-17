package pmb;

import javax.faces.bean.ManagedBean;


import bean.University;
import dao.UniversityDAO;
import util.Massages;

@ManagedBean (name = "mbAddUniversity")
public class MBAddUniversity {
	
	private University university;

	public String save() {
		UniversityDAO universityDAO = new UniversityDAO();
		int row = universityDAO.insert(university);
		if (row > 0) {
			Massages.addMessageByKey("INFO", "", "msg_usave");
		} else {
			Massages.addMessageByKey("INFO", "", "msg_nusave");
		}		university = new University();
		return null;
	}
	
	public University getUniversity() {

		if (university == null) {
			university = new University();
		}

		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

}


