package lab6;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class CollectionsUtil {

	private static final Random RANDOM;

	static {
		RANDOM = new Random();
	}

	public static void addAndSort(List<Integer> list, int value) {

		Iterator<Integer> iterator = list.iterator();
		int idx = 0;

		int prevInt = 0;
		int currInt = 0;

		while (iterator.hasNext()) {
			currInt = iterator.next();

			if (prevInt < value && currInt >= value) {
				idx = list.indexOf(prevInt) + 1;
				break;
			}

			prevInt = currInt;
		}

		if (value > currInt) {
			idx = list.indexOf(currInt) + 1;
		}

		list.add(idx, value);
	}

	public static void addAndSort(Map<Integer, Integer> map, int value) {

		int idx = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (value >= entry.getValue().intValue()) {
				idx = entry.getKey() + 1;
			}
		}

		int currVal = value;
		int nextVal = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (idx == entry.getKey().intValue()) {
				nextVal = entry.getValue();
				map.put(idx, currVal);
				currVal = nextVal;
				idx++;
			}
		}

		map.put(idx, currVal);

	}

	public static void swapValues(List<Integer> list, int idxOne, int idxTwo) {
		int elementOne = list.get(idxOne);
		int elementTwo = list.get(idxTwo);

		list.set(idxOne, elementTwo);
		list.set(idxTwo, elementOne);
	}

	public static void swapValues(Map<Integer, Integer> map, int idxOne, int idxTwo) {
		int elementOne = map.get(idxOne);
		int elementTwo = map.get(idxTwo);

		map.put(idxOne, elementTwo);
		map.put(idxTwo, elementOne);
	}

	public static int findValue(List<Integer> list, int searchVal) {

		for (int i : list) {
			if (i == searchVal) {
				return list.indexOf(searchVal);
			}
		}

		return -1;
	}

	public static int findValue(Map<Integer, Integer> map, int searchVal) {

		if (!map.containsValue(searchVal)) {
			return -1;
		}

		int idx = 0;

		for (int i : map.keySet()) {
			if (map.get(i) == searchVal) {
				idx = i;
			}
		}

		return idx;
	}

	public static int getRandomValue(int lowerBound, int upperBound) {
		return RANDOM.nextInt(upperBound - lowerBound) + lowerBound;
	}
}
