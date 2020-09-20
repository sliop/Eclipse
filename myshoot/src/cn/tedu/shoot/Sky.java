package cn.tedu.shoot;

public class Sky extends FlyingObject {
	private int y1;
	private int speed;
	
	public Sky() {
		super(400, 700, 0, 0);
		y1 = -700;
		speed = 1;
	}
	
	public void step() {
		System.out.println("天空y坐标和y1坐标同时向下移动");
	}
}
