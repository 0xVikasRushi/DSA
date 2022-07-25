import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr.get(0));
        arr.add(1,90);
      /*  int n = 40;
        arr.remove(n);*/
        System.out.println(arr.get(1));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i)); // i is index of arraylist
        }

        for(int i : arr){
            // here i is value of arr
            System.out.println(i);
        }

    }
}
