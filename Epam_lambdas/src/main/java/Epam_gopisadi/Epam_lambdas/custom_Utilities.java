package Epam_gopisadi.Epam_lambdas;


import java.util.*;
import java.util.stream.Collectors;

public class custom_Utilities {
	
	private custom_Utilities() {}
	
	public static double get_Average(List<Integer> numbersList) {
		double avg;
		
		avg = numbersList.stream().reduce(0, (sum, val)-> sum+val);
		avg /= numbersList.size();
		
		return avg;
	}
	
	public static List<String> getFilterStrings(List<String> stringsList){
		return stringsList.stream().filter(s -> (s.startsWith("a") && s.length() == 3)).collect(Collectors.toList());
	}
	
	public static List<String> get_Pallindrome_Strings(List<String> strs){
		return strs.stream().filter(s -> 
		{
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			if(sb.toString().equals(s))
				return true;
			return false;
		}).collect(Collectors.toList());
	}
}