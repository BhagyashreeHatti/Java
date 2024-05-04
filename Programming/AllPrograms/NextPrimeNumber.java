package AllPrograms;

public class NextPrimeNumber {
	public static void main(String[] args) {
		int n=5;
		for(int i=n+1;i<Integer.MAX_VALUE;i++)
		{
			int no=i;
			boolean flag=true;
			for(int j=2;j<no;j++)
			{
				if(no%j==0)
				{
					flag=false;
					break;
				}
		}
			if(flag==true)
			{
				System.out.println("next prime no"+i);
				break;
			}
		
	}
	}
}


