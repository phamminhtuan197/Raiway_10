package Excercise_5;

public class DienThoaiDiDong implements ITanCong {

	@Override
	public void tanCong() {
		System.out.println("Tan cong");
	}
	public void nghe() {
		System.out.println("Nghe dien thoai");
	}
	public void goi() {
		System.out.println("Goi dien thoai");
	}
	public void guiTinNhan() {
		System.out.println("Gui tin nhan");
	}
	public void nhanTinNhan() {
		System.out.println("Nhan tin nhan");
	}
}
