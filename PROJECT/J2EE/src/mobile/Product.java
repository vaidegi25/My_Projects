package mobile;

public class Product {
	
	private int id;
	private String brand;
	private double cost;
	private double discount;
	
	public Product(int id, String brand, double cost, double discount) {
		super();
		this.id = id;
		this.brand = brand;
		this.cost= cost;
		this.discount = discount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setPrice(double price) {
		this.cost = cost;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
