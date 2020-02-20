package CMRIT.Snehith.Task3;

import java.io.IOException;
import java.util.Scanner;

import CMRIT.Snehith.Task3.HouseContructionCost;
import CMRIT.Snehith.Task3.SimpleAndCompoundInterest;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		SimpleAndCompoundInterest Interest = new SimpleAndCompoundInterest(10000.0,3,10.0);
		System.out.write("Simple Interest:".getBytes());
		System.out.format("%.2f\n",Interest.simpleInterest());
		System.out.write("Compound Interest:".getBytes());
		System.out.format("%.2f\n",Interest.compoundInterest());
		System.out.write("Press 1 for STANDARD MATERIAL\nPress 2 for ABOVE STANDARD MATERIAL\nPress 3 for HIGH STANDARD MATERIAL\n".getBytes());
		int materialType = scan.nextInt();
		boolean automatedHome;
		if(materialType==3) {
			System.out.write("If you want AUTOMATED HOME Enter true otherwise false\n".getBytes());
			automatedHome=scan.nextBoolean();
		}else {
			automatedHome = false;
		}
		System.out.write("Enter the total area of the house\n".getBytes());
		double totalArea=scan.nextDouble();
		HouseContructionCost houseCost = new HouseContructionCost(materialType,automatedHome,totalArea);
		System.out.format("%.2f\n",houseCost.totalCostOfContruction());
		scan.close();

	}


}
