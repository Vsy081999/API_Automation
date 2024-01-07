package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Utility {

	static public String getCapital(ArrayList<String> arr1, ArrayList<String> arr2, String state) {

		HashMap<String, String> hm = new HashMap<String, String>();

		for (int i = 0; i < arr1.size(); i++) {

			hm.put(arr1.get(i), arr2.get(i));
		}

		return hm.get(state);

	}

}
