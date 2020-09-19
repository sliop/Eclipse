package cn.tedu.shoot;

import java.util.Random;

public class FlyingObject {
	int width;
	int height;
	int x;
	int y;
	
	FlyingObject(int width, int height) {
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(400 - width + 1);
		y = -height;
	}
	FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	void step() {
		System.out.println("�������ƶ�����");
	}
}