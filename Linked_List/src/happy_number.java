//  https://leetcode.com/problems/happy-number/
import java.util.LinkedList;
public class happy_number {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isHappy(n));
    }
    public  static  boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }else{
            return false;
        }
    }

    public static int square(int n){
       int ans = 0;
       while(n!=0){
           int rem = n % 10;
           ans = ans + rem*rem;
           n = n / 10;
       }
       return ans;
    }
}

