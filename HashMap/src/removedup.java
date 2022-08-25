import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;

public class removedup {
    public static void main(String[] args) {
        int[] nums  = {1,2,2,3,4};
//        System.out.println(removeduplicates(nums));
        System.out.println(maxFrequencyNumber(nums));
    }
//     public static ArrayList<Integer> removeduplicates(int[] nums){
//        ArrayList<Integer> ans = new ArrayList<>();
//         HashMap<Integer,Boolean> map= new HashMap<Integer, Boolean>();
//         for (int i = 0; i < nums.length; i++) {
//             if(map.containsKey(nums[i])){
//                  continue;
//             }
//             ans.add(nums[i]);
//             map.put(nums[i],true);
//         }
//         return ans;
//     }
    public static int maxFrequencyNumber(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i])){
                    int freq = map.get(arr[i]);
                    freq++;
                    map.put(arr[i],freq);
            }else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> ansset=  map.keySet();
        int ans = Integer.MIN_VALUE;
        int max = 0;
        for(int a : arr) {
            if(map.get(a)>max){
                max = map.get(a);
                ans =a;
            }
        }
//        System.out.println(ansset);
        return ans;
    }
}
