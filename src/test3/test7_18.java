package test3;

import java.util.Arrays;
import java.util.Scanner;

public class test7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] list = new double[10];
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("请输入10个double型值：");
        for (int i = 0; i < 10 ; i++){
            list[i] = input.nextDouble();
        }
        list = bubble(list);
        System.out.print(Arrays.toString(list));
    }
    //5. bubble方法：对数组进行冒泡排序
    public static double[] bubble(double[] list){
        int length = list.length;
        double temp = 0;
        for (int a = 0 ; a < length - 1 ; a++){
            for (int i = 0 ; i < length - 1 ; i++){
                if (list[i] > list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        return list;
	}

}
