package Incapsulation2;

import java.util.Random;

public class ReturnTo {

	
	public static void main(String[] args) {
		Random qq=new Random();
		int y=qq.nextInt(100);
		String l;
		if (y>50 && y<100){
			l=" ���������� ��������";
		}else{
			l=" ������������ ��������";
		}
System.out.println(y+l);
	}

}
