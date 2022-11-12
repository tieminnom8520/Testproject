package nopbai;

package nopbai;
//tao class car
public abstract class Shape {
	abstract double getPerimeter() ;
	abstract double getArea();
}
//tao class Rentangle

public class Rentangle extends Shape{
	protected double width;
	protected double height;
	
	public Rentangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public void setSize(double width, double height) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	@Override
	public double getPerimeter() {
		return this.width * 2 + this.height*2;
	}
	public boolean isSquare() {
		return this.width == this.height;
	}
}
//tao class Circle

public class Circle extends Shape{
	protected double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	@Override
	public double getPerimeter() {
		return this.radius * 2 * Math.PI;
	}
}
public class bai3_demo {
	public static void main(String[] args) {
		Rentangle rtg = new Rentangle(3, 2);
		System.out.println("dien tich: " + rtg.getArea() + "   chu vi :"+rtg.getPerimeter());
	}
}
