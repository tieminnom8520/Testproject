package bai4;

public abstract class Car {
	String color="red";
	double speed=5.5;
	public Car() {
	}
	
	
	public String getColor() {
		return this.color;
	}
	public double getspeed() {
		return this.speed;
	}
	public abstract void accelerate() ;
}
public abstract class Bmw extends Car{
	public Bmw() {}
	@Override
	public void accelerate() {
		System.out.println("Tieng xe bmw");
	}
	@Override
	public String toString() {
		return "BMW";
	}
}
