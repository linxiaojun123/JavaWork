package test3;

import java.util.Scanner;

public class test7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int[] array = new int[10];//�������
        int counts = 0;//����
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();//��ȡ�û�����
            boolean repeat = false;//�ж��Ƿ��ظ�
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {//�����±�i֮ǰ������Ԫ�أ��ظ���true
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {//���ظ���ӡ����
                System.out.print(array[i] + " ");
                counts++;
            }
        }
        System.out.println();
        System.out.println("The number of distinct numbers is " + counts);//������ظ����ָ���

	}

}
