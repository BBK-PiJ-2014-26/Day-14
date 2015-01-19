import java.util.*;

public class Anagram {

	public static List<String> getAnagrams(String s) {
		List<String> result = new ArrayList<String>();
		if (s.length() == 1) {
			result.add(s);
			return result;
		} else {
			for(int i = 0; i < s.length(); i++) {
				String firstLetter = "" + s.charAt(i);
				String rest = s.substring(0, i) + s.substring(i + 1, s.length());
				List<String> subAnagrams = getAnagrams(rest);
				for(i = 0; i < subAnagrams.size(); i++) {
					String x = firstLetter + subAnagrams.get(i);
					result.add(x);
				}
			}
			return result;
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		List<String> anagramList = getAnagrams(s);
		for (int i = 1; i < anagramList.size(); i++) {
			System.out.println(anagramList.get(i));
		}
	}
}