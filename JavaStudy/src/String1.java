
public class String1 {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				c += 32;
			} else {
				c -= 32;
			}
			
			System.out.println(c);
		}
	}
}
