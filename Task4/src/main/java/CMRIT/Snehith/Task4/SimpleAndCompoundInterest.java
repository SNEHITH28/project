package CMRIT.Snehith.Task4;

public class SimpleAndCompoundInterest {
	private double principleAmount;
	private double timeInYear;
	private double rateOfInterest;

	SimpleAndCompoundInterest(double principleAmount,double timeInYear,double rateOfInterest){
		this.principleAmount=principleAmount;
		this.timeInYear=timeInYear;
		this.rateOfInterest=rateOfInterest;
	}
	double simpleInterest() {
		double SimpleInterest;
		SimpleInterest=(principleAmount*timeInYear*rateOfInterest)/100;
		return SimpleInterest;
	}
	double compoundInterest() {
		double CompoundInterest=0;
		for(int i = 0;i<timeInYear;i++) {
			if(timeInYear-i>=1) {
				CompoundInterest=CompoundInterest+((principleAmount+CompoundInterest)*rateOfInterest)/100;
		    }
			else {
				CompoundInterest=CompoundInterest+((principleAmount+CompoundInterest)*(timeInYear-i)*rateOfInterest)/100;
			}	
		}	
		return CompoundInterest;
	}

}
