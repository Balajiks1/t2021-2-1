import java.util.HashMap;
import java.util.Map;

public class Problem4 {
	public static void main(String[] args) {
		int [] number= {1,2,3,4,5,6,7,8,9};
		int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

		Map<Integer, Integer> count = new HashMap<>();

		for (int num : input) {
			for (int i = 1; i <= number.length; i++) {
				if (num % i == 0) {
					count.put(i, count.getOrDefault(i, 0) + 1);
				}
			}
		}
		
		System.out.print("{");
		for (int i = 1; i <= number.length; i++) {
			System.out.print(i + ":" + count.getOrDefault(i, 0));
			if (i != number.length) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}
}
