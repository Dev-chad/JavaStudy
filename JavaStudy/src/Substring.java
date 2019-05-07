
public class Substring {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";

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
