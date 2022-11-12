package bai4;
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
	public String toString() {
		return this.getColor()+this.speed;
	}
}
 class Civic extends Car{
	public void accelerate() {
		System.out.println("Tieng xe Civic");
	}
	public String toString() {
		return this.getColor()+this.speed;
	}
}
public class main_car {
	public static void main(String[] args) {
	Car xe1=new Bmw();
	Civic xe2=new Civic();
	xe1.accelerate();
	xe1.toString();
	xe2.accelerate();
	xe2.toString();
	}
}
