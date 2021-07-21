package entity.Excercise1;

public class HinhChuNhat extends HinhHoc {

	public HinhChuNhat(float a, float b) throws HinhHocException {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "HinhChuNhat [a=" + a + ", b=" + b + "]";
	}

	public HinhChuNhat() throws HinhHocException {
	}
	@Override
	public float tinhChuVi(float a, float b) {
		// TODO Auto-generated method stub
		return super.tinhChuVi(a, b);
	}

	@Override
	public float tinhDienTich(float a, float b) {
		// TODO Auto-generated method stub
		return super.tinhDienTich(a, b);
	}
	
}
