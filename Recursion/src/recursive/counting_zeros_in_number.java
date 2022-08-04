package recursive;

import jdk.swing.interop.SwingInterOpUtils;

public class counting_zeros_in_number {

    public static void main(String[] args) {
        System.out.println(countZerosRec(0));
    }
    public static int countZerosRec(int input){
        System.out.println("checking");
     if(input==0){
            return 1;
        }
     if(input<10){
        return 0;
     }
     else if(input%10==0){
         return 1+ countZerosRec(input/10);
     }
     return countZerosRec(input/10);


    }
}
