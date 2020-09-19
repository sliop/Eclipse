package cn.tedu.shoot;

public class Hero extends FlyingObject {
	int life;
	int fire;
	Hero() {
		super(97, 139, 140, 400);
		life = 3;
		fire = 0;
	}
	void step() {
		System.out.println("Ó¢ÐÛ»úÇÐ»»Í¼Æ¬À²£¡");
	}
}
