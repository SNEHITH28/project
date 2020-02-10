import java.util.Scanner;



public class Calculator {
	
	public char oper;
	public int op1;
	public int op2;
	public void operation(char operator,int operand1,int operand2) {
		this.oper=operator;
		this.op1=operand1;
		this.op2=operand2;
		switch(oper) {
		case '+':System.out.println(op1+op2);break;
		case '-':System.out.println(op1-op2);break;
		case '*':System.out.println(op1*op2);break;
		case '/':try {
			System.out.println(op1/op2);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		default:System.out.println("Invalid operation");break;
		}
	}
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Press + for Addition\nPress - for Subtraction\nPress* for Multiplication\nPress / for division");
		int clearOrOff;
		char operator;
		do {
		System.out.println("Enter the operands");
		int operand1=scan.nextInt();
		int operand2=scan.nextInt();
		System.out.println("Enter the Operator: ");
		operator=scan.next().charAt(0);
		c.operation(operator,operand1,operand2);
		System.out.println("Except 0 enter any digit from 1-9 to continue");
		clearOrOff=scan.nextInt();
		}while(clearOrOff!=0);
		scan.close();
	}
}
