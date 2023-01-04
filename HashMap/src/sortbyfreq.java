import java.util.*;

public class sortbyfreq {
        public static void main(String[] args) {
            String str = "cccaaad";
            System.out.println(frequencySort(str));
         }


         public  static String frequencySort(String s) {
             HashMap<Character , Integer> map = new HashMap<>();
             for(int i = 0;i<s.length();i++){
                 if(map.containsKey(s.charAt(i))){
                     int currentFrequency = map.get(s.charAt(i));
                     ++currentFrequency;
                     map.put(s.charAt(i),currentFrequency);
                 }else{
                     map.put(s.charAt(i),1);
                 }
             }
             PriorityQueue<Character> pq=new PriorityQueue<>((a, b)->map.get(b)-map.get(a));
             pq.addAll(map.keySet());
             StringBuilder ans = new StringBuilder();
             // iterating over priority queue

             while(!pq.isEmpty()){
                 char cur=pq.remove();
                 int l=map.get(cur);
                 while(l-->0)
                     ans.append(cur);
             }
             return ans.toString();
        }


}
