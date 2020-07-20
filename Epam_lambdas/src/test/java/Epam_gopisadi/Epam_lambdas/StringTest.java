package Epam_gopisadi.Epam_lambdas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringTest {

	
	@Test
	public void stringFilterTest1() {
		List<String> names = new ArrayList<String>();
		names.add("abcd");
		names.add("avi");
		names.add("gopi");
		names.add("nani");
		names.add("chint");
		names.add("avs");
		
		List<String> filterStrings = custom_Utilities.getFilterStrings(names);
		assertEquals(Arrays.asList(new String[] {"avi","avs"}), filterStrings);
	}
	
	@Test
	public void stringFilterTest2() {
		// Test empty list
		assertEquals(new ArrayList<String>(), custom_Utilities.getFilterStrings(new ArrayList<String>()));
	}
}
