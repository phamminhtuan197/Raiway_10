package entity.Excercise1;

public class HinhTron extends HinhHoc {

	@Override
	public String toString() {
		return "HinhTron [a=" + a + ", b=" + b + "]";
	}

	public HinhTron(float a, float b) throws HinhHocException {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public HinhTron() throws HinhHocException {
	}
	@Override
	public float tinhChuVi(float a, float b) {
		// TODO Auto-generated method stub
		return 2*a*PI;
	}

	@Override
	public float tinhDienTich(float a, float b) {
		return a*a*PI;
	}
		
}
