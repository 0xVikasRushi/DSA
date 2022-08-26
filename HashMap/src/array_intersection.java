import java.util.HashMap;
import java.util.Set;

public class array_intersection {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,3,6,2,5};
        int[] nums1 = {2,4,2,3,5,6,6};
        printIntersection(nums,nums1);

    }
    public static void printIntersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length ; i++) {
            if(map.containsKey(arr1[i])){
                int val = map.get(arr1[i]);
                map.put(arr1[i],val+1);
            }else map.put(arr1[i],1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])){
                int freq = map.get(arr2[i]);
                if(freq>0){
                    System.out.print(arr2[i] + " ");
                    map.put(arr2[i], freq-1);
                }
            }
        }
    }
}
