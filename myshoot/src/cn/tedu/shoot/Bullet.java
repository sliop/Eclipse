package cn.tedu.shoot;

public class Bullet extends FlyingObject {
	private int speed;
	
	public Bullet(int x, int y) {
		super(8, 20, x, y);
		speed = 3;
	}
	
	public void step() {
		System.out.println("子弹y坐标向上移动");
	}
}
