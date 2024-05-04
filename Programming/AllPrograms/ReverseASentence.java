package AllPrograms;

public class ReverseASentence {
	public static void main(String[] args) {
		String str="we are indians";
		String rev="";
		String[]ch=str.split("");
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i]+"";
		}
		System.out.println(rev);
		
	}
	

}
