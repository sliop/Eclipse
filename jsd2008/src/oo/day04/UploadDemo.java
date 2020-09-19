package oo.day04;
public class UploadDemo {
	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.a = 1;
		o1.show();
		Boo o2 = new Boo();
		o2.a = 1;
		o2.show();
		o2.b = 2;
		o2.test();
		Aoo o3 = new Boo();
		o3.a = 1;
		o3.show();
	}
}