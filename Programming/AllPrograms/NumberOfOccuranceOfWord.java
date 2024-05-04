package AllPrograms;

public class NumberOfOccuranceOfWord {
	public static void main(String[] args) {
		String str = "Hello yo u java how are you you";
		String s = "you";
		int count = 0;
		String[] s1 = str.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String st = s1[i];
			if (st.equals(s)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
