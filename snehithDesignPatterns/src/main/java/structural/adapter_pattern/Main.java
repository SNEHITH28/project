package structural.adapter_pattern;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Dog");
		dog.run();
		dog.makeSound();
		System.out.println();
		
		ToyDog toyDog = new  ToyDogs("ToyDog");
		toyDog.bark();
		System.out.println();
		
		ToyDog animalAdapter = new  AnimalAdapter(dog);
		animalAdapter.bark();
	}

}
