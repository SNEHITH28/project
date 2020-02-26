package CMRIT.Snehith.Task4;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import CMRIT.Snehith.Task4.HouseContructionCost;
import CMRIT.Snehith.Task4.SimpleAndCompoundInterest;

public class Client {
	
	private static final Logger LOGGER = LogManager.getLogger(Client.class);

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		SimpleAndCompoundInterest Interest = new SimpleAndCompoundInterest(10000.0,3.75,10.0);
		LOGGER.info("Simple Interest:"+Interest.simpleInterest()+"rs.");
		LOGGER.info("Compoumd Interest:"+Interest.compoundInterest()+"rs.");
		LOGGER.info("Enter material type STANDARD or ABOVE STANDARD or HIGH STANDARD ");
		String materialType = scan.nextLine();
		LOGGER.info("Your have selected "+materialType+" material");
		boolean automatedHouse;
		if(materialType.equalsIgnoreCase("high standard")) {
			LOGGER.info("If you want AUTOMATED HOUSE Enter true otherwise false ");
			automatedHouse=scan.nextBoolean();
		}else {
			automatedHouse = false;
		}
		LOGGER.info("Enter the total area of the house ");
		double totalArea=scan.nextDouble();
		LOGGER.info("The total area of the house is "+totalArea+" square feets");
		HouseContructionCost houseCost = new HouseContructionCost(materialType,automatedHouse,totalArea);
		LOGGER.info("Estimated House Construction Cost:"+houseCost.totalCostOfContruction()+"rs.");
		scan.close();

	}

}
