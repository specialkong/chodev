package info.chodev.algorithm.pureu.sixth;

public class Caesar {
	
	public String caesar(String s, int n) {
		char[] sb = new char[s.length()];
		int idx = 0;
		for(char c:s.toCharArray()) {
			if(c == ' ') {
				sb[idx++] = c;
				continue;
			}
			
			char t = (char)(c + n);
			if(Character.isLowerCase(c)) {
				int j = (t - 'a') % 26;
				sb[idx++] = (char)('a' + j);
			} else if(Character.isUpperCase(c)) {
				int j = (t - 'A') % 26;
				sb[idx++] = (char)('A' + j);
			}
		}

		return new String(sb);
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}
