package cn.tedu.shoot;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel {
	Sky s = new Sky();
	Hero h = new Hero();
	FlyingObject[] enemies = {};
	Bullet[] bts = {};
	
	void action(){ //≤‚ ‘¥˙¬Î
		enemies = new FlyingObject[5];
		enemies[0] = new Airplane();
		enemies[1] = new Airplane();
		enemies[2] = new BigAirplane();
		enemies[3] = new BigAirplane();
		enemies[4] = new Bee();
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject f = enemies[i];
			System.out.println(f.x + "," + f.y);
			f.step();
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		frame.add(world);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 700);
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		
		world.action();
	}
}