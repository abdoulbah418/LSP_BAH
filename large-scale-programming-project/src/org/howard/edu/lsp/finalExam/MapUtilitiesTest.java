package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MapUtilitiesTest {


	@Test
	@DisplayName("Emtpy Hash Maps")
	void testEmptyCommonKeyValuePairs() {
		HashMap<String, String> emptyMap1 = new HashMap<String, String>();
		HashMap<String, String> emptyMap2 = new HashMap<String, String>();
		
		try {
			int count = MapUtilities.commonKeyValuePairs(emptyMap1, emptyMap2);
		}
		catch (NullMapException e) {
			Assertions.assertTrue(true);
		}
	}
	
	@Test
	@DisplayName("2 Common Key Value Pairs")
	void test2CommonKeyValuePairs() throws NullMapException {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Bob", "Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Mary", "Ecastic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Subperb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
		
		int count = MapUtilities.commonKeyValuePairs(map1, map2);
		
		Assertions.assertEquals(count, 2);
	}
	
	@Test
	@DisplayName("No Common Key Value Pairs")
	void testNoCommonKeyValuePairs() throws NullMapException {
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("Alice", "Healthy");
		map3.put("Mary", "Ecastic");
		map3.put("Bob", "Happy");
		map3.put("Chuck", "Fine");
		map3.put("Felix", "Sick");
		
		HashMap<String, String> map4 = new HashMap<String, String>();
		map4.put("Mary", "Healthy");
		map4.put("Felix", "Ecastic");
		map4.put("Ricardo", "Subperb");
		map4.put("Tam", "Happy");
		map4.put("Bob", "Fine");
		
		int count = MapUtilities.commonKeyValuePairs(map3, map4);
		
		Assertions.assertEquals(count, 0);
	}
	
	@Test
	@DisplayName("All Common Key Value Pairs")
	void testAllCommonKeyValuesPairs() throws NullMapException {
		HashMap<String, String> map5 = new HashMap<String, String>();
		map5.put("Alice", "Healthy");
		map5.put("Mary", "Ecastic");
		map5.put("Bob", "Happy");
		map5.put("Chuck", "Fine");
		map5.put("Felix", "Sick");
		
		HashMap<String, String> map6 = new HashMap<String, String>();
		map6.put("Alice", "Healthy");
		map6.put("Mary", "Ecastic");
		map6.put("Bob", "Happy");
		map6.put("Chuck", "Fine");
		map6.put("Felix", "Sick");
		
		int count = MapUtilities.commonKeyValuePairs(map5, map6);
		
		Assertions.assertEquals(count, 5);
	}

}
