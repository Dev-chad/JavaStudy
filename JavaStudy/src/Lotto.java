import java.util.HashSet;

public class Lotto {
	public static void main(String[] args) {
		int[] check = new int[6];

		HashSet<Integer> first = new HashSet<Integer>();

		first.add(6);
		first.add(10);
		first.add(16);
		first.add(28);
		first.add(34);

		HashSet<Integer> second = new HashSet<Integer>(first);
		second.add(43);
		first.add(38);

		HashSet<Integer> myLotto = new HashSet<Integer>();

		for (int i = 0; i < 1000000; i++) {
			myLotto.clear();

			while (myLotto.size() < 6) {
				int preSize = myLotto.size();
				myLotto.add((int) (Math.random() * 45) + 1);
				int size = myLotto.size();

				if (preSize < size) {
					if (size == 3 && first.containsAll(myLotto)) {
						check[5]++;
					} else if (size == 4 && first.containsAll(myLotto)) {
						check[4]++;
					} else if (size == 5 && first.containsAll(myLotto)) {
						check[3]++;
					} else {
						if (second.containsAll(myLotto)) {
							check[2]++;
						} else if (first.containsAll(myLotto)) {
							check[1]++;
						}
					}
				}
			}
		}
		
		for(int i=1; i<6; i++)
		{
			System.out.println(i + "µî: " + check[i]);
		}
	}
}
