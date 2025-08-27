package source;

public class Car {
	private String brand;
	private String model;
	private double price;
	private double milage;
	private String ownerName; 
	private static int totalCars;
	private static String showroomName="TataMotorz";
	public Car(String brand,String model,double price,double milage) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.milage=milage;
		ownerName="Dhanya";
		totalCars++;
	}
	public Car(String brand,String model,double price,double milage,String ownerName) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.milage=milage;
		this.ownerName=ownerName;
		totalCars++;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	public void displayDetails() {
		System.out.println("Brand:"+this.brand);
		System.out.println("Model:"+this.model);
		System.out.println("Price:"+this.price);
		System.out.println("milage:"+this.milage);
		System.out.println("ownwr:"+this.ownerName);
	}
	public void updatePrice(double newPrice) {
		this.price=newPrice;
	}
	public static void showTotalCars() {
		System.out.println("Total Cars:"+totalCars);
	}
	public static void showShowroomName() {
		System.out.println("Showroom:"+showroomName);
	}
	
	
		
	}
	


