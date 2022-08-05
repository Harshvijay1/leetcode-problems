package easy.problems;

public class Goal
{
	class Solution
	{
		public String interpret(String command)
		{
			String empt = "";
			
			String res = "";
			
			for (int i = 0; i < command.length(); i++)
			{
				empt = command.replace("()", "o");
				res = empt.replace("(al)", "al");

			}
			return res;
		}

	}
	
}