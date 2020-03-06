package CMRIT.Snehith.snehithCollections;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import CMRIT.Snehith.snehithCollections.OperationOnLinkedList;
import CMRIT.Snehith.snehithCollections.Student;

public class CustomList {
	
	private static final Logger LOGGER = LogManager.getLogger(CustomList.class);
	
	public static void main(String[] args) {
		
		OperationOnLinkedList operation = new OperationOnLinkedList();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Student[] student = new Student[10];
 		student[0] = new Student(1,"bhavana");
 		student[1] = new Student(2,"pooja");
 		student[2] = new Student(3,"vamshi");
 		student[3] = new Student(4,"sameer");
 		student[4] = new Student(5,"snehith");
 		student[5] = new Student(6,"tejasri");
 		student[6] = new Student(7,"raviteja");
 		student[7] = new Student(8,"pavan");
 		student[8] = new Student(9,"shivanshu");
 		student[9] = new Student(10,"navya");
 		for(int i = 0;i < 10;i++) {
 			operation.insertElementToList(student[i]);
 		}
 		LOGGER.info("-----------------------------------");
 		LOGGER.info("Initially the Elements in the List");
 		operation.displayElementInTheList();
		int Choice;
		while(true) {
			System.out.println("Choose the operation you want to perform..?");
			System.out.println("1.Insert\n2.Delete\n3.Search\n4.Display\n5.Exit");
			Choice=scan.nextInt();
			switch(Choice) {
			case 1:System.out.println("Enter Student ID:");
			       int sId = scan.nextInt();
			       System.out.println("Enter Student Name:");
			       String sName = scan.next();
			       Student STUDENT = new Student(sId,sName);
			       operation.insertElementToList(STUDENT);
			       LOGGER.info(sId+" "+sName+" is inserted ");
			       break;
			case 2:operation.deleteElementFromList();
				   break;
			case 3:System.out.println("Choose how you want to search..?");
			       System.out.println("1.Student Id\n2.Student Name");
			       Choice = scan.nextInt();
			       switch(Choice) {
			       case 1:System.out.println("Enter the keyId you want to search");
			              int keyId = scan.nextInt();
			              if (operation.searchElementInTheListById(keyId) == false){
			            	  LOGGER.info(keyId+" is not in the list");
			              }
			              
			              break;
			       case 2:System.out.println("Enter the keyName you want to search");
			              String keyName = scan.next();
			              if (operation.searchElementInTheListByName(keyName)==false){
			            	  LOGGER.info(keyName+" is not in the list");
			              }
			              break;
			        default:System.out.println("Enter valid searching operation");
			                break;
			       }
				   break;
			case 4:operation.displayElementInTheList();
			       break;
			case 5:LOGGER.info("End of the program");
					System.exit(0);
			default:System.out.println("Enter valid which operation you want to perform");
				    break;
			}
		}	
	}
}
