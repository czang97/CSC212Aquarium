package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

//I worked alone on this Fish class
public class Fish {

	private static final boolean False = false;
	// Formulate the range fish moves by changing low and high.
	final int HIGH = 490;
	final int LOW = 10;
	// create a random number generator:
	Random rand = new Random();

	/**
	 * The position of the fish; x,y-coordinates.
	 */
	public static int x;
	public static int y;
	
	/**
	 * The color fish
	 */
	static float r = rand.nextFloat();
	static float g = rand.nextFloat();
	static float b = rand.nextFloat();
	public static Color color;
	
	public static int xDestination;
	
	// initialize boolean for whether the fish is small or regular;
	public boolean isLittle;
		
	public static boolean isFacingLeft;
	
	
	// constructor
	public Fish(int x, int y, boolean isFacingLeft, boolean isLittle, int xDestination, Color color) {
		
		/**
		 * The position of the fish; x,y-coordinates.
		 */
		this.x = rand.nextInt(HIGH - LOW) + LOW;
		this.y = rand.nextInt(HIGH - LOW) + LOW;

		/**
		 * The color fish
		 */
		this.color color = new Color(r, g, b);

		//The destination of the fish; x-coordinates.
		this.xDestination = rand.nextInt(HIGH - LOW) + LOW;
		
	}
	

	public boolean isFacingLeft() {
		return this.x > this.xDestination;
	}


	// swim method
	public void swim( ) {
		if (this.isFacingLeft) {
			if (this.x > this.xDestination) {
				this.x += 1;
			}else {
				this.x-=1;
			}
		}else{
			if (this.x < this.xDestination) {
				this.x -= 1;
			}else {
				this.x +=1;
			}
		}
			
		if (this.x == this.xDestination) {
			this.xDestination = rand.nextInt(HIGH - LOW) + LOW;
		}
	}

	
	// draw method
	public void draw(Graphics2D g) {
		g.setColor(color);
		
		if (isLittle) {
			if(isFacingLeft) {
				DrawFish.smallFacingLeft(g, color, this.x, this.y);
				this.swim();
			}else {
				DrawFish.smallFacingRight(g, color, this.x, this.y);
				this.swim();
			}
			
		}else {
			if(isFacingLeft) {
				DrawFish.facingLeft(g, color, this.x, this.y);
				this.swim();
			}else {
				DrawFish.facingRight(g, color, this.x, this.y);
				this.swim();
			}
		}		
	}
}

	
		
