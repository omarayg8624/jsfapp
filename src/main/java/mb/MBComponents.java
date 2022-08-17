package mb;

import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "mbComp")
public class MBComponents {

	private String t1;
	private String t2;
	private Date t3;
	private int t4;
	private String t5;
	private boolean t6;
	private String t7;
	private String t8;
	private int t9;
	private int t10;
	private String t11;
	private String t12;
	private MBModel model;
	
	public MBComponents() {
		model = new MBModel();
		MBColumn column1 = new MBColumn();
		MBColumn column2 = new MBColumn();
		MBColumn column3 = new MBColumn();
		column1.addWidget("sports");
		column2.addWidget("weather");
		column3.addWidget("politics");
		model.addColumn(column1);
		model.addColumn(column2);
		model.addColumn(column3);
		}
	
	
	public String submit() {
		return null;
	}

	public MBModel getModel() {
		return model;
	}



	public void setModel(MBModel model) {
		this.model = model;
	}
	
	public String getT12() {
		return t12;
	}



	public void setT12(String t12) {
		this.t12 = t12;
	}



	public Date getT3() {
		return t3;
	}


	public void setT3(Date t3) {
		this.t3 = t3;
	}


	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}


	public int getT4() {
		return t4;
	}


	public void setT4(int t4) {
		this.t4 = t4;
	}


	public String getT5() {
		return t5;
	}


	public void setT5(String t5) {
		this.t5 = t5;
	}


	public boolean isT6() {
		return t6;
	}


	public void setT6(boolean t6) {
		this.t6 = t6;
	}




	public String getT8() {
		return t8;
	}


	public void setT8(String t8) {
		this.t8 = t8;
	}


	public String getT7() {
		return t7;
	}


	public void setT7(String t7) {
		this.t7 = t7;
	}


	public int getT10() {
		return t10;
	}


	public void setT10(int t10) {
		this.t10 = t10;
	}


	public int getT9() {
		return t9;
	}


	public void setT9(int t9) {
		this.t9 = t9;
	}


	public String getT11() {
		return t11;
	}


	public void setT11(String t11) {
		this.t11 = t11;
	}


	

}
