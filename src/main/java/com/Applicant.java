package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "Age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label(value = "Money")
	private java.lang.Double money;
	@org.kie.api.definition.type.Label(value = "Approved")
	private java.lang.Boolean approved;

	public Applicant() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.Double getMoney() {
		return this.money;
	}

	public void setMoney(java.lang.Double money) {
		this.money = money;
	}

	public java.lang.Boolean getApproved() {
		return this.approved;
	}

	public void setApproved(java.lang.Boolean approved) {
		this.approved = approved;
	}

	public Applicant(java.lang.String name, java.lang.Integer age,
			java.lang.Double money, java.lang.Boolean approved) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.approved = approved;
	}

}