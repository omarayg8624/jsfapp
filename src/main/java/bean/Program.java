package bean;

public class Program {
	private int schoolId;
	private int programId;
	private String aName;
	private String eName;
	
	
	public Program() {

	}


	public Program(int schoolId, int programId, String aName, String eName) {
		this.schoolId = schoolId;
		this.programId = programId;
		this.aName = aName;
		this.eName = eName;
	}


	public int getSchoolId() {
		return schoolId;
	}


	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}


	public int getProgramId() {
		return programId;
	}


	public void setProgramId(int programId) {
		this.programId = programId;
	}


	public String getaName() {
		return aName;
	}


	public void setaName(String aName) {
		this.aName = aName;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	@Override
	public String toString() {
		return "Program [schoolId=" + schoolId + ", programlId=" + programId + ", aName=" + aName + ", eName=" + eName
				+ "]\n";
	}
	
	

	
	
}
