package cn.tedu.shoot;

public class BigAirplane extends FlyingObject {
	int speed;
	BigAirplane() {
		super(66, 89);
		speed = 2;
	}
	void step() {
		System.out.println("大敌机y坐标向下移动");
	}
}
