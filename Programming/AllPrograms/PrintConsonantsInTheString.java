package AllPrograms;

public class PrintConsonantsInTheString {
	public static void main(String[] args) {
		String s="developers";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
		   if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
		   {
			   System.out.println(ch);
		   }
		}
	}
}
		
		
	
	
	


