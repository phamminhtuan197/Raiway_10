package entity.Excercise1;

public class HinhHoc {
	float a;
	float b;
	public static float PI = 3.14f;
	public static int COUNT = 0;
	
	public float tinhChuVi(float a, float b) {
		return (a+b)*2;
	}

	public float tinhDienTich(float a, float b) {
		return a*b;
	}
	
	public HinhHoc() throws HinhHocException {
		super();
		if (COUNT < Configs.SO_LUONG_HINH_TOI_DA) {
			COUNT++;
		}
		else {
			throw new HinhHocException("Chi duoc tao toi da " + Configs.SO_LUONG_HINH_TOI_DA + " hinh");
		}
	}
	@Override
	public String toString() {
		return "HinhHoc [a=" + a + ", b=" + b + "]";
	}

	public HinhHoc(float a, float b) throws HinhHocException {
		super();
		COUNT++;
		if (COUNT <= Configs.SO_LUONG_HINH_TOI_DA) {
			this.a = a;
			this.b = b;
		}
		else {
			throw new HinhHocException("Chi duoc tao toi da " + Configs.SO_LUONG_HINH_TOI_DA + " hinh");
		}
	}
}
