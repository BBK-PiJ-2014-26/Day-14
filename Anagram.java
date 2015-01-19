import java.util.ArrayList;

public class Anagram {

	public static List<String> getAnagrams(String s) {
		List<String> result = new ArrayList<String>();
		if (s.length() == 1) {
			result.add(s);
			return result;
		} else {
			for(int i = 0; i < s.length(); i++) {
				String firstLetter = "" + s.charAt(i);
				String rest = s.substring(0, i) + s.subString(i + 1, s.length());
				List<String> subAnagrams = getAnagrams(rest);
				for(int i = 0; i < subAnagrams; i++) {
				String x = firstLetter + subAnagrams.getItem[i];
					result.add(x);
				}
			}
			return result;
		}
	}

	public static void main(String[] args) {
		String s = "abs";
		List<String> anagramList = ArrayList<String>();
		anagramList = Anagram.getAnagrams(s);
		for (int i = 0; i < anagramList.size(); i++) {
			System.out.println(anagramList.getItem());
		}
	}
}