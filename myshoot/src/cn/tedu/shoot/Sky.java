package cn.tedu.shoot;

public class Sky extends FlyingObject {
	int y1;
	int speed;
	Sky() {
		super(400, 700, 0, 0);
		y1 = -700;
		speed = 1;
	}
	void step() {
		System.out.println("���y�����y1����ͬʱ�����ƶ�");
	}
}
