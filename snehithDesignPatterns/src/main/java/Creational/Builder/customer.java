package Creational.Builder;

public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		McMeal M1 = new McMeal("Veg","Small");
		System.out.println("Order 1");
		M1.BillOfYourOrder();
		System.out.println();
		
		McMeal M2 = new McMeal("Veg","Medium");
		System.out.println("Order 2");
		M2.BillOfYourOrder();
		System.out.println();
		
		McMeal M3 = new McMeal("Non-Veg","Large");
		System.out.println("Order 3");
		M3.BillOfYourOrder();

	}

}
