package Creational.AbstactFactory;

public class LandAnimal extends Animal{

	private String animalName;
	
	LandAnimal(String animalName){
		this.animalName = animalName;
	}

	@Override
	public void wayOfLiving() {
		System.out.println(animalName + " lives on the land. ");
	}

	@Override
	public void wayOfSytle() {
		System.out.println(animalName + " will run.");	
	}
	
}