package test2;
public class test3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // number��ֵ��Ӧ�ƵĴ�С��colorͨ��switchתΪ��ɫ
        int number = (int)(Math.random() * 13 + 1);
        int color = (int)(Math.random() * 4);

        // numberתΪString����
        String str_Number;
        if(number == 1)
            str_Number = "ACE";
        else if(number == 11)
            str_Number = "Jack";
        else if(number == 12)
            str_Number = "Queen";
        else if(number == 13)
            str_Number = "King";
        else
            str_Number = "" + number;

        // colorתΪString����
        String str_Color;
        switch (color){
            case 0:str_Color="Clubs";break;
            case 1:str_Color="Diamonds";break;
            case 2:str_Color="Heart";break;
            default:str_Color="Spades";
        }

        // ���
        System.out.println("The card you picked is " + str_Number + " of " + str_Color);


	}

}
