package structural.adapter_pattern;

public interface Animal {
	public void run();
	public void makeSound();
}

class Dog implements Animal{
	
	private String name;

	Dog(String name){
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name + " running");	
	}

	@Override
	public void makeSound() {
		System.out.println(name + " will bark");
	}
	
}

