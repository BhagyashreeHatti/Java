package AllPrograms;

public class LowercaseToUppercase {
	public static void main(String[] args) {
		String str="Bhagyashree";
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='3')
			{
				ans=ans+(char)(ch-32);
			}
		}
		System.out.println(ans);
	}
		
	}
	
