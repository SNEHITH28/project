package Creational.Builder;

public class McMeal {
	private String MealType;
	private String MealSize;

	McMeal(String MealType,String MealSize ){
		this.MealType = MealType;
		this.MealSize = MealSize;
	}
	
	void BillOfYourOrder() {
		System.out.println("--------------------------------");
		System.out.println("           McDonald's        ");
		System.out.println("--------------------------------");
		System.out.println("Meal Type\t\t"+MealType);
		System.out.println("Meal Size\t\t"+MealSize);
		System.out.println("Coke     \t\t"+MealSize); // Additional you will get
		System.out.println("FrenchFries \t\t"+MealSize); // Additional you will get
		System.out.println("--------------------------------");
	}
}
