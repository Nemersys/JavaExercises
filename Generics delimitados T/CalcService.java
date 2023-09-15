package prova;

import java.util.List;

public class CalcService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		T max = list.get(0);
		for (T item: list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
