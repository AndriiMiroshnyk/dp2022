package mock;

import crud.Lab2CrudInterface;
import laptops.Laptops;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Laptops readLaptops() {
		return new Laptops("MACBOOK PRO", "assets/mac.jpg", "The MacBook Pro is the most powerful laptop Apple has ever made. If you’re willing to pay the price (and it’s a steep price), you’ll almost certainly be satisfied with what this machine can do.");
	}
	
	/*
	public Laptops readLaptops2() {
		return new Laptops("HP SPECTRE X360", "assets/spectre.jpg", "It’s hard to come up with a single complaint about the Spectre x360 14. It’s a drop-dead gorgeous machine with a sturdy build and a premium look and feel.");
	} */

	/*
	public Laptops readLaptops3() {
		return new Laptops("DELL XPS 13", "assets/xps.jpg", "If you’re looking for a convertible laptop that does just about everything right, we recommend Dell’s latest XPS 13 2-in-1. It features a sturdy and well-made chassis, a nearly bezel-free 16:10 touch display, and Intel’s newest 11th Gen processors.");
	} */
	

	@Override
	public void updateLaptops(Laptops laptops) {

	}

}
