package test2;
import java.util.Scanner;
public class test3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ȡ������
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // ����
        double x0 = -2.5, x1 = 2.5;      // xֵ������
        double y0 = -5.0, y1 = 5.0;      // yֵ������

        // �ֱ��ж�x��y�Ƿ��ھ��η�Χ�ڣ�boolX�ж�x2�Ƿ��ڷ�Χ�ڣ�boolY�ж�y2�Ƿ��ڷ�Χ��
        boolean boolX = false,boolY = false;
        if(x2 >= x0 && x2 <= x1)
            boolX = true;
        if(y2 >= y0 && y2 <= y1)
            boolY = true;

        // bool����boolX��boolY�Ľ���������Ŀ�����ʳ�ã�
        boolean bool = (boolX && boolY)? true : false;

        // ������
        if(bool){
            System.out.println("Point (" + x2 + ", " +  y2 + ") is in the rectangle");
        }else{
            System.out.println("Point (" + x2 + ", " +  y2 + ") is not in the rectangle");
        }

	}

}
