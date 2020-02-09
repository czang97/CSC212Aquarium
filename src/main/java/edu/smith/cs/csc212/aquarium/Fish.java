

package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Fish {
	
	// Configure how hard the game is by changing low and high.
				final int HIGH = 490;
				final int LOW = 10;
				
		// create a random number generator:
			Random rand = new Random(); 
			
	/**
	 * The position of the fish; x-coordinate.
	 */
			
	public int x = rand.nextInt(HIGH - LOW) + LOW;
	/**
	 * The position of the fish; y-coordinate.
	 */
	public int y = rand.nextInt(HIGH - LOW) + LOW;

	/**
	 * The color fish
	 */
	public Color color = Color.blue;
    
	public int yDestination = rand.nextInt(HIGH - LOW) + LOW;
	/**
	 * The position of the fish; y-coordinate.
	 */
	public int xDestination = rand.nextInt(HIGH - LOW) + LOW;

	
	
		
	
	public Fish() {
		
	} 
	
	
	public boolean isfacingLeft(int x, int y) {
		return x > xDestination;
	}
	
	
	public void draw(Graphics2D g) {
		g.setColor(color);
		DrawFish.facingLeft(g, Color.yellow, x, y);
	}
	
}
	

	
