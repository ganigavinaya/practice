package practice;

public class MinSwapsSequenceInc {

	public int minSwap(int[] A, int[] B) {
		int n1=0;
		int s1=1;
		
		
        for(int i=1;i<A.length;i++) {
        	int n2=Integer.MAX_VALUE,s2=Integer.MAX_VALUE;
        	if(A[i-1]<A[i] && B[i-1]<B[i]) {
        		n2=n1;
        		s2=s1+1;
        	}
        	if(A[i-1]<B[i] && B[i-1]<A[i]) {
        		n2=s1;
        		s2=n1+1;
        	}
        	n1=n2;
        	s1=s2;
        }
        return Math.min(n1, s1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}