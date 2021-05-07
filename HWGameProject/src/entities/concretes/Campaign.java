package entities.concretes;

import entities.abstracts.Entity;

public class Campaign implements Entity{
	int id;
	String name;
	double percent;
	double priceAfterDiscount;
	public Campaign() {
	}
	
	public Campaign(int id,String name, double percent) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}

	
}
