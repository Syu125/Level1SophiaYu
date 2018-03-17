package LeagueInvaders;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;



public class ObjectManager {
 Rocketship r2;
 long enemyTimer;
 long enemySpawnTime;
 ArrayList<Projectile>po=new ArrayList<>();
 ArrayList<Alien>al=new ArrayList<>();
	public ObjectManager(Rocketship r) {
		r2 = r;
		enemyTimer = 0;
		enemySpawnTime = 1000;
	}
	void update() {
		r2.update();
		for(Projectile pr: po) {
			pr.update();
		}
		for(Alien an : al) {
			an.update();
		}
	}
	void draw(Graphics g) {
		r2.draw(g);
		for(Projectile pro : po) {
			pro.draw(g);
		}
		for(Alien ans : al) {
			ans.draw(g);
		}
	}
	void addProjectile(Projectile p) {
		po.add(p);
	}
	void addAlien(Alien a) {
		al.add(a);
	}
	void purgeObjects() {
		
		
		
	}
	public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.w), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}
	
}
