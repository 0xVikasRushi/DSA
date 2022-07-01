package recursive;

public class sorted_or_not {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4};
        System.out.println(checkNumber(nums,0));
    }
    static int i = 0;
    public static boolean checkNumber(int input[], int x) {
        if(i==input.length-1){
            return false;
        }
        if(input[i]==x){
            return true;
        }
            i++;
            return checkNumber(input,x);
    }
}
