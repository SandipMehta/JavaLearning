package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ThirdLargestInArray {
	public int thirdLargestInArray(int a[], int total) {
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// IT WONT WORK AS WE NEED TO USE HASH MAP FOR SAME

		return a[total - 3];
	}

	public void thirdLargestArrayUsingCollectionFw() {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(5);
		arrlist.add(6);
		arrlist.add(3);
		arrlist.add(2);
		arrlist.add(6);
		arrlist.add(4);
				
		Collections.sort(arrlist);
		Collections.reverse (arrlist);

		System.out.println(arrlist);

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int i = 0;

		for (Integer n : arrlist) {
			if (!hm.containsValue(n)) {
				i++;
				hm.put(i, n);
			}
		}

		if (hm.size() < 3)
			System.out.println("There are less then 3 unique values in list.");
		else
			System.out.println("Third largest Value is : " + hm.get(3));
	
	}
}
