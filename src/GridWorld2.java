import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld2 {

public static void main(String[] args) {
	World world=new World();
	for(int i =0; i<10; i++) {
		for(int j =0; j<10; j++) {
			Location l=new Location(i,j);
		if(i==j) {
			world.add(l, new Bug());
		}
		if(i+j==9) {
			world.add(l, new Bug());
		}
	}
	}

	world.show();
	
	
}
}
