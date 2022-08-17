package pmb;

import javax.faces.bean.ManagedBean;

import bean.Program;
import dao.ProgramDAO;
import util.Massages;

@ManagedBean(name = "mbAddProgram")
public class MBAddProgram {

	private Program program;

	public String save() {
		ProgramDAO programDAO = new ProgramDAO();
		int row = programDAO.insert(program);
		if (row > 0) {
			Massages.addMessageByKey("INFO", "", "msg_psave");
		} else {
			Massages.addMessageByKey("INFO", "", "msg_npsave");
		}
		program = new Program();
		return null;
	}

	public Program getProgram() {

		if (program == null) {
			program = new Program();
		}

		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

}
