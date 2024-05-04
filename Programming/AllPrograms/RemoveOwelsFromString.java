package AllPrograms;

public class RemoveOwelsFromString {
	public static void main(String[] args) {
		String str="1de36o";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				System.out.println(ch);
			}
		}
		
	}

}
