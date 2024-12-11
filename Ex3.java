package interview;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
	public static void main(String[] args) {
		Map<Double, Double> hashTable = new HashMap<>();
		hashTable.put(0.35, 0.35);
		hashTable.put(0.38, 0.38);
		hashTable.put(0.52, 0.52);
		hashTable.put(0.58, 0.58);
		hashTable.put(0.93, 0.93);
		hashTable.put(0.37, 0.37);
		hashTable.put(0.28, 0.28);
		hashTable.put(0.32, 0.32);
		hashTable.put(0.26, 0.26);
		hashTable.put(0.39, 0.39);
		hashTable.put(0.29, 0.29);
		hashTable.put(0.34, 0.34);
		hashTable.put(0.40, 0.40);
		double current = 0.0;
		while (current != 5.28) {
			switch ((int) (current * 10)) {
			case 0:
				current = 1.29;
				break;
			case 1:
				current = 2.26;
				break;
			case 2:
				current = 3.52;
				break;
			case 3:
				current = 4.35;
				break;
			case 4:
				current = 5.28;
				break;
			case 5:
				current = 6.58;
				break;
			case 6:
				current = 7.28;
				break;
			default:
				break;
			}
			System.out.print(current + " ");
		}
		System.out.println();

		for (Map.Entry<Double, Double> entry : hashTable.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}
}
