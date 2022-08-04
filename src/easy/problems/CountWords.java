package easy.problems;

public class CountWords {
	class Solution {
		public int mostWordsFound(String[] sentences) {

			int size = sentences.length;

			int noofwords = 0;

			for (int i = 0; i < size; i++) {
				String[] newArray = sentences[i].split(" ");
				if (newArray.length > noofwords) {
					noofwords = newArray.length;
				}
			}
			return noofwords;
		}
	}
}