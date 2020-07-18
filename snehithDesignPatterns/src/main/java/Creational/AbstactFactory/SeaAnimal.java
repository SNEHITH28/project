package Creational.AbstactFactory;

public class SeaAnimal extends Animal {
	
	private String animalName;
	
	SeaAnimal(String animalName){
		this.animalName = animalName;
	}

	@Override
	public void wayOfLiving() {
		System.out.println(animalName + " lives under water. ");
	}

	@Override
	public void wayOfSytle() {
		System.out.println(animalName + " will swims.");	
	}
}
