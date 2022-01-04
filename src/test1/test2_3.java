package test1;

import java.util.Scanner;

public class test2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three number: ");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		double average=(number1+number2+number3)/3;
		System.out.println("The average of "+number1+" "+number2
		  +" "+number3+" is "+average);

	}

}
