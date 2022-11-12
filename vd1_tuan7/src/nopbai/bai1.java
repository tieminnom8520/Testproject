package nopbai;

//tao class xe
public abstract class Xe {
	public Xe() {
		
	}
	abstract void brake(); 
}
//tao class xe may 
public class XeMay extends Xe {
	public XeMay() {
		super();
	}
	@Override 
	public void brake() {
		System.out.println("chiec xe mamamamamamaaammamam");
	}
}
//tao class xe dap
public class XeDap extends Xe {
	public XeDap() {
		super();
	}
	@Override 
	public void brake() {
		System.out.println("");
	}
}
//tao class xe hoi
public class XeHoi extends Xe {
	public XeHoi() {
		super();
	}
	@Override 
	public void brake() {
		System.out.println("helloooooooooooooooooooooooooo");
	}
}