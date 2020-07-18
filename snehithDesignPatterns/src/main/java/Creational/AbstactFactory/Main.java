package Creational.AbstactFactory;

public class Main {

	public static void main(String[] args) {
		Animal a = new LandAnimal("Dog");
		a.wayOfLiving();
		a.wayOfSytle();
		
		Animal a1 = new SeaAnimal("Tuna");
		a1.wayOfLiving();
		a1.wayOfSytle();
	}

}
