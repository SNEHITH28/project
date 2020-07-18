package structural.adapter_pattern;

public interface ToyDog {
	public void bark();
}

class ToyDogs implements ToyDog{

	private String name;

	public ToyDogs(String name) {
		this.name = name;
	}

	@Override
	public void bark() {
		System.out.println(name + " barks");
	}
}

class AnimalAdapter implements ToyDog{
	Animal animal;
	public AnimalAdapter(Animal animal) {
		this.animal = animal;
	}
	@Override
	public void bark() {
		System.out.println("AnimalAdapter");
		animal.makeSound();
	}
}