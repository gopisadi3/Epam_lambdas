package Epam_gopisadi.Epam_lambdas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PallindromTest {

	@Test
	public void pallindromeTest() {
		List<String> strs = new ArrayList<String>();
		strs.add("abcd");
		strs.add("abab");
		strs.add("bbbb");
		strs.add("cbbbbc");
		strs.add("ababa");
		strs.add("abababa");
		
		List<String> fstrs = custom_Utilities.get_Pallindrome_Strings(strs);
		assertEquals(Arrays.asList(new String[] {"bbbb","cbbbbc", "ababa", "abababa"}), fstrs);
	}
}