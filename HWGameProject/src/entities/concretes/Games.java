package entities.concretes;

public class Games{
	
	String id;
	String name;
	double price;
	double unitsInStock;
	
	public Games() {
	}
	
	public Games(String id, String name, double price, double unitsInStock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.unitsInStock = unitsInStock;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(double unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
}
