package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

//I worked alone on this Fish class
public class Fish {

	// Formulate the range fish moves by changing low and high.
	final int HIGH = 490;
	final int LOW = 10;
	// create a random number generator:
	Randomrand=new Random();

	/**
	 * The position of the fish; x,y-coordinates.
	 */
	public int x = rand.nextInt(HIGH - LOW) + LOW;
	public int y = rand.nextInt(HIGH - LOW) + LOW;

	/**
	 * The color fish
	 */
	static float r = rand.nextFloat();
	static float g = rand.nextFloat();
	static float b = rand.nextFloat();
	public static Color color = new Color(r, g, b);

	/**
	 * The destination of the fish; x,y-coordinates.
	 */
	public int yDestination = rand.nextInt(HIGH - LOW) + LOW;
	public int xDestination = rand.nextInt(HIGH - LOW) + LOW;

	// private boolean False;
	// public boolean isLittle = False;

	public Fish() {

	}

	public static void draw(Graphics2D g, boolean isfacingLeft, boolean isLittle, int x, int y) {
		g.setColor(color);

		if (!isLittle) {
			if (isfacingLeft && x > 10) {
				DrawFish.facingLeft(g, Color.yellow, x, y);
				x -= 1;
			} else if (isfacingLeft && x <= 10) {
				DrawFish.facingRight(g, Color.yellow, x, y);
				x += 1;
			} else if (!isfacingLeft && x < 490) {
				DrawFish.facingRight(g, Color.yellow, x, y);
				x += 1;
			} else {
				DrawFish.facingLeft(g, Color.yellow, x, y);
				x -= 1;
			}
		} else {
			if (isfacingLeft && x > 10) {
				DrawFish.smallFacingLeft(g, Color.yellow, x, y);
				x -= 1;
			} else if (isfacingLeft && x <= 10) {
				DrawFish.smallFacingRight(g, Color.yellow, x, y);
				x += 1;
			} else if (!isfacingLeft && x < 490) {
				DrawFish.smallFacingRight(g, Color.yellow, x, y);
				x += 1;
			} else {
				DrawFish.smallFacingLeft(g, Color.yellow, x, y);
				x -= 1;
			}
		}

	}
}
