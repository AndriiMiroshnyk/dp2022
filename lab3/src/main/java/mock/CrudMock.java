package mock;

import java.util.ArrayList;
import java.util.List;

import laptops.Laptops;

public class CrudMock {


	private List<Laptops> LaptopsList = new ArrayList<>();
	
	public CrudMock() {		
		this.LaptopsList.add(new Laptops(0,"MACBOOK PRO","assets/mac.jpg", "The MacBook Pro is the most powerful laptop Apple has ever made. If you’re willing to pay the price (and it’s a steep price), you’ll almost certainly be satisfied with what this machine can do."));
		this.LaptopsList.add(new Laptops(1,"HP SPECTRE X360","assets/spectre.jpg", "It’s hard to come up with a single complaint about the Spectre x360 14. It’s a drop-dead gorgeous machine with a sturdy build and a premium look and feel."));
		this.LaptopsList.add(new Laptops(2,"DELL XPS 13","assets/xps.jpg", "If you’re looking for a convertible laptop that does just about everything right, we recommend Dell’s latest XPS 13 2-in-1. It features a sturdy and well-made chassis, a nearly bezel-free 16:10 touch display, and Intel’s newest 11th Gen processors."));
	}
	
	public List<Laptops> getLaptopsList() {
		return LaptopsList;
	}

	public void setLaptopsList(List<Laptops> laptopsList) {
		LaptopsList = laptopsList;
	}
	
}
