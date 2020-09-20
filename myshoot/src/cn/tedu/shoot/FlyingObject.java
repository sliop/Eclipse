package cn.tedu.shoot;

import java.util.Random;

public class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	
	public FlyingObject(int width, int height) {
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(400 - width + 1);
		y = -height;
	}
	
	
	public FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public void step() {
		System.out.println("∑…––ŒÔ“∆∂Ø¿≤£°");
	}
}
