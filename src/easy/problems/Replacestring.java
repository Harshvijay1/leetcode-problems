package easy.problems;

public class Replacestring {
	public String defangIPaddr(String address) {
		String add = "[.]";
		String res = "";
		int len = address.length();
		for (int i = 0; i < len; i++) {
			if (address.charAt(i) == '.') {
				res += add;
			} else {
				res += address.charAt(i);
			}
		}
		return res;
	}
}
