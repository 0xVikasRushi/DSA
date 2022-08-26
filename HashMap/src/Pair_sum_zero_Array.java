import java.util.HashMap;

public class Pair_sum_zero_Array {
    public static void main(String[] args) {
        int[] nums = {2,1,-2,2,3};
        PairSum(nums,nums.length);
    }
    public static void PairSum(int[] input, int size) {
        if (size == 0)
            return;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (h.containsKey(-input[i]) && h.get(-input[i]) != 0) {
                int count = h.get(-input[i]);

                while (count != 0) {
                    if (input[i] > 0)
                        System.out.println(-input[i] + " " + input[i]);
                    else
                        System.out.println(input[i] + " " + (-input[i]));
                    count--;
                }
                if (h.containsKey(input[i]))
                    h.put(input[i], h.get(input[i]) + 1);
                else
                    h.put(input[i], 1);
            } else {
                if (h.containsKey(input[i])) {
                    h.put(input[i], h.get(input[i]) + 1);
                } else {
                    h.put(input[i], 1);
                }
            }


        }
//    public static int PairSum(int[] input, int size) {
//        if(size==0) return 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int ans =0;
//        for (int i = 0; i <size ; i++) {
//            if(map.containsKey(-input[i])&& map.get(-input[i])>0){
//                int freq = map.get(-in)
//            }
//        }
//        return ans;
//    }
    }
}
