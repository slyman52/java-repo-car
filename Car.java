package tutorials;

public class Car {

	private String model;
	private String year;
	private double price;
	
	Car(String model, String year, double price){
		this.model = model;
		this.year = year;
		if (price>=0)
			this.price = price;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel (String model) {
		this.model = model;
	}
	
	public String getYear () {
		return this.year;
	}
	
	public void setYear (String year) {
		this.year = year;
	}
	
	public double getPrice () {
		return this.price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	
}

