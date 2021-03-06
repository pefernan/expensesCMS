package com.myspace.expensescms;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Expense implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "EXPENSE_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "EXPENSE_ID_SEQ", name = "EXPENSE_ID_GENERATOR")
	private Long id;

	@org.kie.api.definition.type.Label("Employee")
	private String employee;

	@org.kie.api.definition.type.Label("Location")
	private String location;

	@org.kie.api.definition.type.Label("Department")
	private String department;

	@org.kie.api.definition.type.Label("Subject")
	private String subject;

	@org.kie.api.definition.type.Label("Amount")
	private Double amount;

	@org.kie.api.definition.type.Label("Approved")
	private Boolean approved = false;

	@org.kie.api.definition.type.Label(value = "Date")
	private java.util.Date date;

	public Expense() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployee() {
		return this.employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getApproved() {
		return this.approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public Expense(Long id, String employee,
			String location, String department,
			String subject, Double amount,
			Boolean approved, java.util.Date date) {
		this.id = id;
		this.employee = employee;
		this.location = location;
		this.department = department;
		this.subject = subject;
		this.amount = amount;
		this.approved = approved;
		this.date = date;
	}

}