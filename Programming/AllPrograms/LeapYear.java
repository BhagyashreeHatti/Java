package AllPrograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sar=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sar.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("its a leap year");
			
		}else {
			System.out.println("Not Leap  Year");
		}
		
	}
	
}
