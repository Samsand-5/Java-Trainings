package arrays;

import java.util.HashMap;
import java.util.Map;

import accessModifiers.Parent;

public class ArraysUtility {
	public static void main(String[] args) {
//		int[] arr = {1,4,45,67,78};
//		int[] arr2 = {1,4,5,67,78};
//		int target = 45;
////		System.out.println(Arrays.binarySearch(arr, target));
//		
//		
////		int[] array = Arrays.copyOf(arr, 7);
////		for(int i : array) {
////			System.out.println(i);
////		}
//		
////		for(int i : Arrays.copyOfRange(arr, 0, 3)) {
////			System.out.println(i);
////		}
//		
//		System.out.println(Arrays.equals(arr, arr2));
//		
//		
//		int[] arr3 = {4,2,67,7,9,36};
//		Arrays.sort(arr3);
//		System.out.println(Arrays.toString(arr3));

//		String jsonString = "{ \"names\": [\"Alice\", \"Bob\", \"Charlie\"] }";
//		jsonString = jsonString.substring(jsonString.indexOf("[") + 1, jsonString.indexOf("]")).trim();
//		System.out.println(jsonString);

		String jsonString = "{ \"name\": \"Alice\", \"age\": \"25\", \"address\": { \"city\": \"New York\", \"zip\": \"10001\" } }";
//		System.out.println(jsonString.indexOf("address"));
		// Extracting the address part
		String addressJson = jsonString
				.substring(jsonString.indexOf("{", jsonString.indexOf("address")), jsonString.lastIndexOf("}")).trim();
		System.out.println(addressJson);
		addressJson = addressJson.replaceAll("\\{", "").replaceAll("\\}", "").trim();
		/*
		 * Exception in thread "main" java.util.regex.PatternSyntaxException: Illegal
		 * repetition near index 1
		 *  The error you're encountering is due to the way
		 * you're using replaceAll("{", ""). The issue is that { is a special character
		 * in regular expressions (regex), and replaceAll() interprets its argument as a
		 * regex pattern. In regex, { is used for quantifiers (like {2,5}), and since
		 * you didn’t escape it, the regex parser throws an Illegal repetition error.
		 * 
		 * Solution
		 * 
		 * addressJson = addressJson.replaceAll("\\{", "").replaceAll("\\}", "").trim();

		 */
		System.out.println(addressJson);
		// Splitting by commas (careful with nested JSON)
		String[] keyValuePairs = addressJson.split(",");

		// Storing values in a map
		Map<String, String> addressMap = new HashMap<>();
		for (String pair : keyValuePairs) {
			System.out.println(pair);
			String[] entry = pair.split(":");
			String key = entry[0].trim().replace("\"", "");
			String value = entry[1].trim().replace("\"", "");
			addressMap.put(key, value);
		}

		System.out.println("Parsed Address Map: " + addressMap);
		
//		System.out.println(Parent.a);
	}
}
