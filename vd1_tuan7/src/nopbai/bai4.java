package nopbai;

package nopbai;
//tao class car
public abstract class Car {
	protected String color;
	protected double speed;
	
	abstract void accerlerate();
	
	public String  getColor() {
		return color;
	}
	public double getSpeed() {
		return speed;
	}
}
//tao class Bmw

public class Bmw extends Car {
	public Bmw(String clr) {
		this.speed = 200;
		this.color = clr;
	}
	@Override
	public void accerlerate() {
		System.out.println("xe Bmw dang tang toc");

	}
	@Override
	public String toString() {
		return "xe Bmw " + "toc do : " + this.getSpeed() + "  mau:" + this.getColor();
	}
}
//tao class Civic

public class Civic extends Car{
	public Civic(String color) {
		this.color = color;
		this.speed = 250;
	}
	@Override
	public void accerlerate() {
		System.out.println("xe Civic dang tang toc");

	}
	@Override
	public String toString() {
		return "xe Civic " + "toc do : " + this.getSpeed() + "  mau:" + this.getColor();
	}
}
public class bai4 {
	public static void main(String[] args) {
		Bmw xe1 = new Bmw("Vang");
		System.out.println(xe1.toString());
		xe1.accerlerate();
	}
}
