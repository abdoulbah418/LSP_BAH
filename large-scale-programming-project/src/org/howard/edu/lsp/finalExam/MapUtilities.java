package org.howard.edu.lsp.finalExam;
import java.util.HashMap;

public class MapUtilities {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) throws NullMapException {
		int count = 0;
		
		if (map1.isEmpty() || map2.isEmpty() || map1 == null || map2 == null) {
			throw new NullMapException("One or both maps are null!");
		}
		
		for (String key: map1.keySet()) {
			if (map1.get(key) == map2.get(key)) {
				count += 1;
			}
		}
		
		return count;
	}
}
