package entities.concretes;

import entities.abstracts.Entity;

public class Customer implements Entity{

	String id;
	String name;
	String lastName;
	double birthYear;
	
	public Customer() {
		
	}
	
	public Customer(String id, String name, String lastName, double birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthYear = birthDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBirthDate() {
		return birthYear;
	}

	public void setBirthDate(double birthDate) {
		this.birthYear = birthDate;
	}
	
	
	
}
