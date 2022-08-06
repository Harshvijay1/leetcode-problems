package easy.problems;

public class ShuffleString {
	class Solution {
		public String restoreString(String s, int[] indices)
		{
			String ans=null;
			
			char[] ansArray = new char[indices.length];
			
			for (int i = 0; i < indices.length; i++)
			{
				ansArray[indices[i]] = s.charAt(i);
				ans = String.valueOf(ansArray);
			}
			return ans;
		}
	}
}
