package cn.tedu.shoot;

import java.util.Random;

public class Bee extends FlyingObject {
	int xSpeed;
	int ySpeed;
	int awardType;
	Bee() {
		super(60, 51);
		xSpeed = 1;
		ySpeed = 2;
		Random rand = new Random();
		awardType = rand.nextInt(2);
	}
	void step() {
		System.out.println("С�۷�x���������ƶ���y���������ƶ�");
	}
}