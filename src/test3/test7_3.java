package test3;

import java.util.Scanner;

public class test7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] lst1 = new int[101];
	        int n = -1;
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        System.out.print("Enter the integers between 1 and 100: ");
	        do{
	            n = input.nextInt();
	            ++lst1[n];
	        }while(n != 0);

	        for (int i = 1; i < 101;i++){
	            if (lst1[i] == 0){continue;}
	            else if (lst1[i] == 1){
	                System.out.println(i + " occurs " + lst1[i] + " time");
	            } else
	                System.out.println(i + " occurs " + lst1[i] + " times");
	        }
	}
}
