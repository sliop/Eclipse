package cn.tedu.shoot;

public class Bullet extends FlyingObject {
	int speed;
	Bullet(int x, int y) {
		super(8, 20, x, y);
		speed = 3;
	}
	void step() {
		System.out.println("�ӵ�y���������ƶ�");
	}
}
