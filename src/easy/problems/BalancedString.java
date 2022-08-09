package easy.problems;

public class BalancedString {
	class Solution {
		public int balancedStringSplit(String s)
		{
			int nl = 0;
			
			int nr = 0;
			
			int count = 0;
			
			for (int i = 0; i < s.length(); i++)
			{
				if (s.substring(i,i+1).equals("L"))
				{  /* i,i+1 (0-1)read string 0 to 1*/
					++nl;
				} else
					++nr;
				if (nl == nr)
				{
					count++;
				}
			}
			return count;

		}
	}
}
