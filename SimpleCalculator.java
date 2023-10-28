package basictraining;

import java.util.*;

public class SimpleCalculator {
	public static void main(String args[]) {
		System.out.println("Enter your choice:");
		System.out.println("1.add");
		System.out.println("2.substract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Reminder");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter option number:");
		int c=s.nextInt();
		System.out.println("Enter first number:");
		
		int a=s.nextInt();
		System.out.println("Enter second number:");
		int b=s.nextInt();
		
		switch(c) {
		case 1:
			
			System.out.println("result:"+a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println("Multiply;"+ a*b);
			break;
		case 4:
			System.out.println("divide;"+ a/b);
			break;
		case 5:
			System.out.println("Reminder:"+ a%b);
			break;
		}
		}
		
			
	}



