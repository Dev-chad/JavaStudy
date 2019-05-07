
public class Substring {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";

		int startIndex = 0;
		int endIndex = 0;

		while (true) {
			endIndex = str.indexOf(" ", startIndex + 1);

			if (endIndex == -1) {
				break;
			}

			System.out.println(str.substring(0, endIndex));
			
			startIndex = endIndex;
		}
	}
}
