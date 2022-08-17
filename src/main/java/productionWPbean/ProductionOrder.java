package productionWPbean;

import java.util.Date;

public class ProductionOrder {
	
	private int id;
	private Date date;
	private String code;
	private String name;
	private double weight;
	private double quantity;
	private String shiftOperator;
	private double workingHours;
	private String mixtureName;
	private String batchNumber;
	private String notes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getShiftOperator() {
		return shiftOperator;
	}
	public void setShiftOperator(String shiftOperator) {
		this.shiftOperator = shiftOperator;
	}
	public double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	public String getmixtureName() {
		return mixtureName;
	}
	public void setmixtureName(String mixtureName) {
		this.mixtureName = mixtureName;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
