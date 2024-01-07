package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Addarraylist_to_Hashmap {

	public static void main(String[] args) {

		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("MP");
		arr1.add("UP");

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Bhopal");
		arr2.add("Lucknow");

		String stateCapital = Utility.getCapital(arr1, arr2, "UP");
		System.out.println("Capital   :" + stateCapital);

	
	}
}
