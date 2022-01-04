package test2;
import java.util.Scanner;

public class test3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub 
		System.out.print(" ‰»Î"); 
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		int n3 = (int)(Math.random()*10); 
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		String a=input.next(); 
		int p1=a.charAt(0)-'0'; 
		int p2=a.charAt(1)-'0'; 
		int p3=a.charAt(2)-'0'; 
		if(p1==n1&&p2==n2&&p3==n3)
			System.out.println("10000"); 
		else if((p1==n2&&p2==n3&&p1==n3)||(p1==n2&&p2==p1&&p3==n3)|| (p1==n1&&p2==n3&&p3==n2) ||(p1==n3&&p2==n2&&p3==p1)&&(p1==n3&&p2==n1&&p3==n2)) { 
			System.out.println("3000"); 
		}else if(p1==n1||p1==n2||p1==n3||p2==n1||p2==n2||p2==n3||p3==n1||p3==n2||p3==n1) {
			System.out.println("1000"); }else {System.out.println("sorry");
			
		}
		
		
		

	}

}
