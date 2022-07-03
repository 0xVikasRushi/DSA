package recursive;

public class sum_of_digits_and_mutplication {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
        System.out.println(multiplyTwoIntegers(3,5));
    }
    public static int multiplyTwoIntegers(int m, int n){
        if(n==0 || m==0){
            return 0;
        }
        return m + multiplyTwoIntegers(m,n-1);
    }









    public static int sumOfDigits(int input){
        if(input==0){
            return 0;
        }
        return input%10 + sumOfDigits(input/10) ;
    }
}
