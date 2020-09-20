package cn.tedu.shoot;

public class Airplane extends FlyingObject {
	private int speed;
	public Airplane() {
		super(48, 50);
		speed = 2;
	}
	public void step() {
		System.out.println("小敌机y坐标向下移动");
	}
}
