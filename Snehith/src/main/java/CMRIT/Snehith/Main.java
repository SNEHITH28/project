package CMRIT.Snehith;

import CMRIT.Snehith.Chocolate;
import CMRIT.Snehith.Cookies;
import CMRIT.Snehith.Gift;
import CMRIT.Snehith.Sweet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate s1=new Chocolate("KitKat",7.9,100);
		Chocolate s2=new Chocolate("5Star",15.5,200);
		Cookies c1=new Cookies("Kiss",31.2,112);
		Cookies c2=new Cookies("Unibic",13.2,58);
		Sweet []s=new Sweet[4];
		s[0]=s1;
		s[1]=s2;
		s[2]=c1;
		s[3]=c2;
		Gift g=new Gift(s);
		g.sort();
		g.getDisplay();
	}

}
