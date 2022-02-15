package fileIO;

import laptops.Laptops;

public class Main {

	public static void main(String[] args) {
		Laptops laptops = new Laptops("Macbook", "assets/mac.jpg", "Best macbook");
		
		FileIOInterface fio = new FileIO();

		fio.saveToFile(laptops);
		System.out.println((Laptops) fio.loadFromFile());
	}

}
