package AllPrograms;

public class FrequencyOfGivenNumber {
	public static void main(String[] args) {
		String str="hello";
		char[]ch=str.toCharArray();
		int[]fr=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<fr.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					fr[j]=-1;
				}
		}
			if(fr[i]!=-1)
			{
				fr[i]=count;
			}
		
	}
		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=-1)
			{
				System.out.println(ch[i]+" "+fr[i]);
			}
		}}}
	
	
		
	


