package mo;

/**
 * 
 * @author elmasry
 * 
 * Gamma 2011
 * Find the number of substrings in a given string that are a palindrom
 *
 */
public class Palindromic {

	public int solution ( String S ) {
		if (S.length() < 2 || S.length() > 20000) return 0;
		int numSolutions = 0;
		
		for (int i = 0; i < S.length(); i++) {
			int left = i, right = i+1;
			while (left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)) {
				numSolutions++;
				left--;
				right++;
				if (numSolutions > 100000000) return -1;
			}
			
			while (left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)) {
				numSolutions++;
				left--;
				right++;
				if (numSolutions > 100000000) return -1;
			}
			
			left = i;
			right = i+2;
			while (left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)) {
				numSolutions++;
				left--;
				right++;
				if (numSolutions > 100000000) return -1;
			}
		}
		return numSolutions;
	}
	
	public static void main(String[] args) {
		System.out.println(new Palindromic().solution("baababab"));
	}
}
