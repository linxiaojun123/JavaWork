package test1;
import java.util.Scanner;

public class test2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		double purchaseAmount=input.nextDouble();
		double tax=purchaseAmount*0.06;
		System.out.println("Sales tax is &"+(int)(tax*100)/100.0);
		
		

	}

}
