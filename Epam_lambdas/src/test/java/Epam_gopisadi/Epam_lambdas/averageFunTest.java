package Epam_gopisadi.Epam_lambdas;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class averageFunTest{

	@Test
	public void AverageFunTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(4);
		l.add(2);
		l.add(3);
		double avg = custom_Utilities.get_Average(l);
		assertEquals(3.0, avg, 1000);
	}
	
}

