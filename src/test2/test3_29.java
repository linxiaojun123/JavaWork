package test2;
import java.util.Scanner;
public class test3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // �����û�����
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), r1 = input.nextDouble();
        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble(), r2 = input.nextDouble();

        // ��������Բ�ĵľ���
        double distance = Math.pow(Math.pow(x1-x2,2) + Math.pow(y1-y2,2), 0.5);

        // �жϾ�����Բ��֮��Ĺ�ϵ
        if(distance < Math.abs(r1-r2))
            System.out.println("circle2 is inside circle1");
        else if(distance < r1+r2)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not onverlap circle1");

	}

}
