package test2;

import java.util.Scanner;

public class test3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		String a=input.next();
		int sum=0; 
		for(int i=0;i<9;i++) { 
			sum+=(a.charAt(i)-'0')*(i+1); 
		}sum%=11; 
		if(sum==10) {
			a+='X'; 
		}else {
			a+=(char)('0'+sum); 
		}
		System.out.println(a);
		
	}

}
