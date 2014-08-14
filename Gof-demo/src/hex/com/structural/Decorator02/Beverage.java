package hex.com.structural.Decorator02;

public abstract class Beverage {
	String description = "Unknow Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}