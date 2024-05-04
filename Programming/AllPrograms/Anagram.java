package AllPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		if(s1.length()==s2.length())
		{
			char[]ch=s1.toCharArray();
			char[]bh=s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(bh);
			if(Arrays.equals(ch, bh))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
		}else
		{
			System.out.println("Not an anagram due to the length");
		}
		
	}

}
