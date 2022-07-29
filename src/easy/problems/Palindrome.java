package easy.problems;

public class Palindrome {

	class Solution {
		public boolean isPalindrome(int x) {
			int dupx = x;
			int rem = 0;
			int rev = 0;
			while (dupx != 0) {
				rem = dupx % 10;
				rev = rev * 10 + rem;
				dupx = dupx / 10;
			}
			if (x == rev && x >= 0) {
				return true;
			}
			if (x < 0) {
				return false;
			}
			return false;

		}
	}
}
