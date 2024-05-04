package AllPrograms;

public class SpecialDigitOrNot {
	public static void main(String[] args) {
		int no=40;
		int sum=0;
		int d1=no%10;
		int d2=no/10;
		sum=d1+d2+(d1*d2);
		if(sum==no)
		{
			System.out.println("special digit");
		}
		else {
			System.out.println("not a special digit");
		}
		
	}

}
