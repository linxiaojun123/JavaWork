package test7;

import java.util.Scanner;
import java.util.ArrayList;

public class java1116 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        list.add(answer);
        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            while (list.contains(answer)) {
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }
            list.add(answer);
        }
        System.out.println("You got it!");
    }
}
