package recursive;

public class Sequence_of_1_by_k {
    public static void main(String[] args) {
        System.out.println(findGeometricSum(4));
    }
	public static double findGeometricSum(int k){
		if(k==0){
            return 1;
        }
        return  1/(double)Math.pow(2,k) + findGeometricSum(k-1);
	}
}
