package recursive;

public class return_index_array {
    public static void main(String[] args) {
        int[] nums = {21,22 ,46, 12 ,61 ,21, 33, 16, 99, 96 };
        int[] arr = {9 ,8 ,10 ,8 };
        System.out.println(firstIndex(arr,8));
        System.out.println(lastIndex(nums,21));
    }

    static int j=0;
    static int i=0;
    static int count=0;
    public static int lastIndex(int input[], int x) {

        if(count==0){
            j = input.length-1;
            count++;
        }

        if(j==0){
            return -1;
        }
        if(input[j]==x){
            return j;
        }
        j--;
        return lastIndex(input,x);
    }

        public static int firstIndex(int input[], int x) {
        if(i==input.length){
            return -1;
        }
       if(input[i]==x){
           return i;
       }
       i++;
       return firstIndex(input,x);
    }


}
