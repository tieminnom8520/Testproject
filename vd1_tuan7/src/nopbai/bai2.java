package nopbai;

public abstract class Abstractjob {
	public Abstractjob() {
		
	}
	abstract String getTen();
	abstract void doJob();
}
// tao class manual job
public class Manualjob extends Abstractjob{
	
}
//tao class buildhouse
public class BuildHouse extends Manualjob{
	@Override
	public String getTen() {
		return this.getClass().toString();
	}
	@Override
	public void doJob() {
		System.out.println("Dang xay nha");
	}
}
//tao class javaCoding
public class JavaCoding extends Abstractjob{
	@Override
	public String getTen() {
		return this.getClass().toString();
	}
	@Override
	public void doJob() {
		System.out.println("Dang Coding");
	}
}
