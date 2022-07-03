package strings;

public class Palindrome_recursive {
	public static void main(String[] args) {
		System.out.println(isStringPalindrome(""));
	}
	public static boolean isStringPalindrome(String input) {
		if(input.length()==1 || input.length()==0){
			return true;
		}
		if(input.charAt(0)==input.charAt(input.length()-1)){
			return isStringPalindrome(input.substring(1,input.length()-1));
		}else {
			return false;
		}

	}
}
