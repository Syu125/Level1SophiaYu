import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

public static void main(String[] args) {
	World world=new World();
	Bug bug=new Bug();
	Bug bug2=new Bug();
	for(int i =0; i<10; i++) {
		for(int j =0; j<10; j++) {
			Location l=new Location(i,j);
		
		if(i%2==0) {
			world.add(l, new Flower(Color.RED));
		}else {
			world.add(l, new Flower(Color.WHITE));
		}
	}
	}
	Location location=new Location(7,5);
	Location l2=new Location(2,3)
			;
	world.show();
	world.add(location, bug);
	world.add(l2, bug2);
	bug2.setColor(Color.BLUE);
	bug2.setDirection(90);
	
	
}
}
