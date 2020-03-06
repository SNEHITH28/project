package CMRIT.Snehith.snehithCollections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import CMRIT.Snehith.snehithCollections.Node;

public class OperationOnLinkedList {
	public Node headNode = null;
	public Node tailNode = null;
	
	private static final Logger LOGGER = LogManager.getLogger(OperationOnLinkedList.class);
	
	public void insertElementToList(Student STUDENT) {
		Node newNode = new Node(STUDENT);
		if(headNode == null) {
			headNode = newNode;
			tailNode = newNode;
		}
		else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public void deleteElementFromList() {
		Node finalNode = headNode;
		Node previousNode = null;
		if(headNode == null) {
			LOGGER.info("List is empty");    
            return;  
		}
		else if(headNode.next == null) {
			LOGGER.info(tailNode.s.studentId+" "+tailNode.s.studentName+" is deleted");
				headNode = null;
				tailNode = null;
			}
		else {
			while(finalNode.next != null) {
				previousNode=finalNode;
				finalNode = finalNode.next;
			}
			previousNode.next = null ;
			LOGGER.info(tailNode.s.studentId+" "+tailNode.s.studentName+" is deleted");
			tailNode = previousNode;
		}
	}
	
	public void displayElementInTheList() {
		Node currentNode = headNode;
		if(headNode == null) {    
			LOGGER.info("List is empty");    
            return;    
        }  
		LOGGER.info("---------------------------------");
		LOGGER.info("     Elements in the list");
		LOGGER.info("---------------------------------");
		LOGGER.info("Student Id        Student Name");
		LOGGER.info("---------------------------------");
        while(currentNode != null) {       
        	LOGGER.info(currentNode.s.studentId + "\t\t  " + currentNode.s.studentName);    
            currentNode = currentNode.next;    
        } 
        LOGGER.info("---------------------------------");
	}
	public Boolean searchElementInTheListById(int keyId) {
		Node currentNode = headNode;
		if (headNode.s.studentId == keyId) {
			LOGGER.info(currentNode.s.studentId+" "+currentNode.s.studentName+" is in the list");
			return (true);
		}
		else {
			while(currentNode != null) {
				currentNode = currentNode.next;
				if (currentNode.s.studentId == keyId) {
					LOGGER.info(currentNode.s.studentId+" "+currentNode.s.studentName+" is in the list");
					return (true);
				}
			}	
		}
		return false;
	}
	public Boolean searchElementInTheListByName(String keyName) {
		Node currentNode = headNode;
		if (headNode.s.studentName == keyName) {
			LOGGER.info(currentNode.s.studentId+" "+currentNode.s.studentName+" is in the list");
			return (true);
		}
		else {
			while (currentNode != null) {
				currentNode = currentNode.next;
				if (currentNode.s.studentName.equalsIgnoreCase(keyName)) {
					LOGGER.info(currentNode.s.studentId+" "+currentNode.s.studentName+" is in the list");
					return (true);
				}
			}	
		}
		return false;
	}
}
