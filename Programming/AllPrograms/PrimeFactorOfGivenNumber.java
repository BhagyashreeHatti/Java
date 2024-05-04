package AllPrograms;

public class PrimeFactorOfGivenNumber {
	public static void main(String[] args) {
		int no=6;
		for(int i=1;i<no/2;i++)
		{
			if(i>=1&&no%i==0&&prime(i))
			{
				System.out.println(i);
			}
		}
		}
		static boolean prime(int x)
		{
			boolean flag=true;
			for(int i=2;i<x/2;i++)
			{
				if(x%i==0)
				{
					flag=false;
					break;
				}
			}
			return flag;
		}
	
	

}
