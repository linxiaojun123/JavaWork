package test3;

import java.util.Scanner;

public class test7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int[] array = new int[10];//存放数字
        int counts = 0;//计数
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();//读取用户输入
            boolean repeat = false;//判断是否重复
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {//遍历下标i之前的数组元素，重复则true
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {//不重复打印数字
                System.out.print(array[i] + " ");
                counts++;
            }
        }
        System.out.println();
        System.out.println("The number of distinct numbers is " + counts);//输出不重复数字个数

	}

}
