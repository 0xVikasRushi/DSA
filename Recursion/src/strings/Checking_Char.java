package strings;

public class Checking_Char {
	public static void main(String[] args) {
		System.out.println(checkAB("abbaabb"));
	}
	public static boolean check(String input){
		if(input.length()==0){
			return true;
		}
		if(input.charAt(0) =='a'){
			if(input.length()==1){
				return true;
			} else if (input.charAt(1)=='a') {
				return check(input.substring(1));
			}
			else if (input.length()>=3 && input.substring(1,3).equals("bb")){
				return check(input.substring(2));
			}
		}
		else if(input.charAt(0)=='b'){
			if(input.length()==1){
				return true;
			}else if(input.charAt(1)=='a'){
				return check(input.substring(1));
			}else{
				return false;
			}
		}
		return false;

	}

	public static boolean checkAB(String input) {
		if(input.charAt(0)!='a'){
			return false;
		}
		else {
			return check(input);
		}
	}
}
