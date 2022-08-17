package mb;

import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.imageio.ImageIO;

import bean.Emp;
import dao.EmpDAO;
import report.Report;

@ViewScoped
@ManagedBean(name = "mbEmp")
public class MBEmp {

	private List<Emp> empTable;
	private List<Emp> emp;
	private EmpDAO empDAO;
	private Emp selectedEmp;

	@PostConstruct
	public void init() {
		empDAO = new EmpDAO();
		empTable = empDAO.selectAll();
		selectedEmp = new Emp();
	}

	public String updateEmp() {
		empDAO.update(selectedEmp);
		empTable = empDAO.selectAll();
		return null;
	}

	public String removeEmp() {
		empDAO.delete(selectedEmp.getId());
		empTable = empDAO.selectAll();
		return null;
	}

	public String runEmpReport() throws Exception {

		Map<String, Object> param = new HashMap<String, Object>();
		BufferedImage image = ImageIO.read(getClass().getResourceAsStream("/Images/icon1.png"));
		param.put("P_Deptno", new BigDecimal(99));
		param.put("P_Image", image);

		Report report = new Report();
		report.runPdf("Emp3.jasper", param);

		return null;
	}

	public List<Emp> getEmpTable() {
		return empTable;
	}

	public void setEmpTable(List<Emp> empTable) {
		this.empTable = empTable;
	}

	public EmpDAO getEmpDAO() {
		return empDAO;
	}

	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	public Emp getSelectedEmp() {
		return selectedEmp;
	}

	public void setSelectedEmp(Emp selectedEmp) {
		this.selectedEmp = selectedEmp;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

}
