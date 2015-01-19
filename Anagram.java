public class Anagram {

	public static void listAnagrams(char firstLetter, String remainingChar) {
		List<String> precalculated = new List();
		for(int i = 0; i > (remainingChar.length + 1); i++) {
			precalculated.add(firstLetter);
		}
		for(int i = 0;
}