

public class IsOneAway{


	public static boolean determineIsOneAway(String text1, String text2){
		char[] c1 = text1.toCharArray();
		char[] c2 = text2.toCharArray();
		
		if(Math.abs(text1.length() - text2.length()) > 1)
			return false;
		
		else if(text1.length() == text2.length())
			return isOneAwaySameLength(c1, c2);
		
		else if(text1.length() > text2.length())
			return isOneAwayDifferentLength(c1, c2);
		
		else
			return isOneAwayDifferentLength(c2, c1);
		
	}

	public static boolean isOneAwaySameLength(char[] c1, char[] c2){
		int countDiff = 0;
		
		for(int i = 0; i < c1.length; i++){
			if(c1[i] != c2[i]) { 
				countDiff += 1;
				if(countDiff > 1)
					return false;
			}
		}
		return true;
	}
	
	public static boolean isOneAwayDifferentLength(char[] c1, char[] c2){
		int count = 0;
		int countDiff = 0;
		
		while (count < c2.length){
			if (c1[count + countDiff] != c2[count]){
				countDiff += 1;
				if (countDiff > 1)
					return false;
			}else
				count += 1;
		}
		return true;
	}
	
	
	
	public static void main(String[] args){
		//Is one away string length difference greater than 1 : should be false
		String s1 = "ace";
		String s2 = "abcde";

		System.out.println(determineIsOneAway(s1, s2));
		
		//Is one away same length: should be true
		String s3 = "abcd";
		String s4 = "abce";
		System.out.println(determineIsOneAway(s3, s4));
		
		//Is one away same length: should be false
		String s5 = "abcd";
		String s6 = "abee";
		System.out.println(determineIsOneAway(s5, s6));
		
		//Is one away different length: should be true
		String s7 = "abcde";
		String s8 = "abce";
		System.out.println(determineIsOneAway(s7, s8));
		
		//Is one away different length: should be true
		String s9 = "abcd";
		String s10 = "abcde";
		System.out.println(determineIsOneAway(s10, s9));
		
		//Is one away different length: should be false
		String s11 = "abco";
		String s12 = "abcde";
		System.out.println(determineIsOneAway(s12, s11));
		
		
		
		
	}
	


}