package CMRIT.Snehith.Task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseContructionCost {
	private String materialType;
	private boolean automatedHouse;
	private double totalArea;
	private static final Logger LOGGER = LogManager.getLogger(HouseContructionCost.class);

	HouseContructionCost(String materialType,boolean automatedHouse,double totalArea){
		this.materialType=materialType;
		this.automatedHouse=automatedHouse;
		this.totalArea=totalArea;
	}
	double totalCostOfContruction() {
		double totalCost = 0 ;
		if(materialType.equalsIgnoreCase("standard")) {
			totalCost = 1200*totalArea;
		}
		else if(materialType.equalsIgnoreCase("above standard")) {
			totalCost = 1500*totalArea;
		}
		else if(materialType.equalsIgnoreCase("high standard")) {
			if(automatedHouse) {
				totalCost = 2500*totalArea;
				LOGGER.info("Your are selected Automated house");
			} else {
				totalCost = 1800*totalArea;
				LOGGER.info("Your are not selected Automated house");
			}
		}
		else {
			LOGGER.info("Invalid Material Type");
		}
		return totalCost;
	}
}
