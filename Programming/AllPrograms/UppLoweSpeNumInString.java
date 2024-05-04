package AllPrograms;

public class UppLoweSpeNumInString {
	public static void main(String[] args) {
		String str = "Hello#*java79$&";
		int uc = 0;
		int lc = 0;
		int sc = 0;
		int nc = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'z')
				uc++;

			else if (ch >= 'a' && ch <= 'z') {

				lc++;
			} else if (ch >= '0' && ch <= '9') {
				nc++;
			} else if (ch == '$' || ch == '*' || ch == '#' || ch == '&') {
				sc++;
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(sc);
		System.out.println(nc);
	}

}
