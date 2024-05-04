package AllPrograms;

public class DesiriumNumber {
	public static void main(String[] args) {
		int no=153;
		int no1=no;
		int no2=no;
		int sum=0;
		int count=0;
		while(no!=0)
		{
			no=no/10;
			count++;
		}
		while(no!=0)
		{
			int rem=no%10;
			sum+=Math.pow(rem,count);
			no1=no1/10;
			count--;
		}
		if(no2==sum) {
			System.out.println("Desirium Number");
		}
		else
		{
			System.out.println("Not Desirium Number");
		}
		
	}

}
