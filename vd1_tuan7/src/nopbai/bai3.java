package nopbai;

//tao class HangSanXuat
public class HangSanXuat {
	protected String tenHangSanXuat;
	protected String tenQuocGia;
	
	public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.tenQuocGia = tenQuocGia;
	}
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}
	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	public String getTenQuocGia() {
		return tenQuocGia;
	}
	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
}
//tao class MayBay

public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	
	public MayBay(String loaiNhienLieu, String hangSanXuat, String tenQuocGia) {
		this.hangSanXuat = new HangSanXuat(hangSanXuat, tenQuocGia);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	double layVanToc() {
		return 2000;
	}
	public void catCanh() {
		System.out.println("Dang cat canh");
	}
	public void haCanh() {
		System.out.println("Dang ha canh");
	}
}
//tao Class Oto

public class XeOto extends PhuongTienDiChuyen {
	public String loaiNhienLieu;
	public XeOto(String loaiNhienLieu, String hangSanXuat, String tenQuocGia) {
		this.hangSanXuat = new HangSanXuat(hangSanXuat, tenQuocGia);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	double layVanToc() {
		// TODO Auto-generated method stub
		return 200;
	}

}
//tao Class XeDap

public class XeDap extends PhuongTienDiChuyen {
	public XeDap(String tenHangSanXuat, String tenQuocGia) {
		this.hangSanXuat = new HangSanXuat(tenHangSanXuat, tenQuocGia);
	}
	@Override
	double layVanToc() {
		// TODO Auto-generated method stub
		return 20;
	}

}

public class bai3 {
	public static void main(String[] args) {
		MayBay mb = new MayBay("Airbus","My","Xang");
		System.out.println("test may bay :");
		mb.catCanh();
		System.out.println("van toc :" + mb.layVanToc());
		mb.haCanh();
	}
}