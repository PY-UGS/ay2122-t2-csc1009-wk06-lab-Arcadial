package lab6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestCollections {

	private static final int UPPER_BOUND = 10000;
	private static final int LOWER_BOUND = 1000;

	public static void main(String[] args) {

		/** Questions 1 - 3 using LinkedList **/
		System.out.println("***** Questions 1 - 3 using LinkedList *****\n");

		List<Integer> list = new LinkedList<>();
		list.add(0);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);

		// Question 1
		System.out.println("Before order of list: " + list);
		CollectionsUtil.addAndSort(list, 12);
		System.out.println("After order of list: " + list);

		// Question 2
		System.out.println("Before swapping of list: " + list);
		CollectionsUtil.swapValues(list, 1, 5);
		System.out.println("After swapping of list: " + list);

		// Question 3
		List<Integer> randomList = new LinkedList<>();
		while (randomList.size() < 500) {
			randomList.add(CollectionsUtil.getRandomValue(LOWER_BOUND, UPPER_BOUND));
		}

		int idxValue = CollectionsUtil.findValue(randomList, CollectionsUtil.getRandomValue(LOWER_BOUND, UPPER_BOUND));
		System.out.println("Index of value is " + idxValue);

		/** Questions 4 - 6 using HashTable **/
		System.out.println("\n***** Questions 4 - 6 using HashMap *****\n");

		Map<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(hashMap.size(), 0);
		hashMap.put(hashMap.size(), 3);
		hashMap.put(hashMap.size(), 5);
		hashMap.put(hashMap.size(), 7);
		hashMap.put(hashMap.size(), 9);
		hashMap.put(hashMap.size(), 11);

		// Question 4
		System.out.println("Before order of hashmap: " + hashMap);
		CollectionsUtil.addAndSort(hashMap, 6);
		System.out.println("After order of hashmap: " + hashMap);

		// Question 5
		System.out.println("Before swapping of hashmap: " + hashMap);
		CollectionsUtil.swapValues(hashMap, 1, 5);
		System.out.println("After swapping of hashmap: " + hashMap);

		// Question 6
		Map<Integer, Integer> randomMap = new HashMap<>();
		int mapSize = 0;

		while (mapSize < 500) {
			randomMap.put(mapSize, CollectionsUtil.getRandomValue(LOWER_BOUND, UPPER_BOUND));
			mapSize++;
		}

		idxValue = CollectionsUtil.findValue(randomMap, CollectionsUtil.getRandomValue(LOWER_BOUND, UPPER_BOUND));
		System.out.println("Index of value is " + idxValue);
	}

}
