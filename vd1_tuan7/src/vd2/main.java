package vd2;
class  Shape extends Hinh{
	public void draw() {
		System.out.println("Hinh vuong");
	}
	public void getColor() {
		System.out.println("Mau do");
	}
}
class Recrangle extends Shape{
	public void draw() {
		System.out.println("Hinh chu nhat");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Hinh tron");
	}
}
public class main {

	public static void main(String[] args) {
		Shape h1=new Shape();
		Recrangle h2=new Recrangle();
		Circle h3=new Circle();
		h1.draw();
		h1.getColor();
		h2.draw();
		h2.getColor();
		h3.draw();
		h3.getColor();

	}

}
