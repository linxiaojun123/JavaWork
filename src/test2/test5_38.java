package test2;

import java.util.Scanner;

public class test5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. �����û������10��������
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("������һ��ʮ����������");
        int decimal = input.nextInt();

        // 2. ��ʮ������������ת������8�������������ʮ����������ʽ�洢�˽�����
        int remainder = 0, binary = 0;
        for (int i = 1;decimal > 0;i *= 10){
            remainder = decimal % 8;
            decimal /= 8;
            binary += remainder * i;
        }

        // 3. ���
        System.out.println(binary);

	}

}
