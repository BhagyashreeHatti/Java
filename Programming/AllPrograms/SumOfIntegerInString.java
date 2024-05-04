package AllPrograms;

public class SumOfIntegerInString {
	public static void main(String[] args) {
		String str="hle2ll30";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=sum+(ch-'0');
			}
			
		}
		System.out.println(sum);
		
	}

}
