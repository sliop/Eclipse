package cn.tedu.shoot;

public class BigAirplane extends FlyingObject {
	private int speed;
	
	public BigAirplane() {
		super(66, 89);
		speed = 2;
	}
	public void step() {
		System.out.println("大敌机y坐标向下移动");
	}
}
