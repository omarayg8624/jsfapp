package pmb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.Program;
import dao.ProgramDAO;
import report.Report;
@ViewScoped
@ManagedBean (name = "mbProgram")
public class MBProgram {
		
		private List<Program> programTable;
		private ProgramDAO programDAO;
		private Program selectedProgram;
		private List<Integer> prTable;

		@PostConstruct
		public void init() {
			programDAO = new ProgramDAO();
			prTable = programDAO.selectById();
			setProgramTable(programDAO.selectAll());
			selectedProgram = new Program ();
		}
		
		public String updateProgram ( ) {
			programDAO.update(selectedProgram);
			setProgramTable(programDAO.selectAll());
			return null;
		}
		
		public String removeProgram ( ) {
			programDAO.delete(selectedProgram.getProgramId());
			setProgramTable(programDAO.selectAll());
			return null;
		}
		
		public String runProgramReport() throws Exception {

			Report report = new Report();
			report.runPdf("Program.jasper", null);

			return null;
		}

		public List<Program> getProgramTable() {
			return programTable;
		}

		public void setProgramTable(List<Program> programTable) {
			this.programTable = programTable;
		}

		public Program getSelectedProgram() {
			return selectedProgram;
		}

		public void setSelectedProgram(Program selectedProgram) {
			this.selectedProgram = selectedProgram;
		}

		public List<Integer> getPrTable() {
			return prTable;
		}

		public void setPrTable(List<Integer> prTable) {
			this.prTable = prTable;
		}

}
