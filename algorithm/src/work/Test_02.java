package work;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		int[] result = run(A,K);
		
		for(int item : result) {
			System.out.println(item);
		}

	}

	private static int[] run(int[] A, int K) {
		if(A.length == K) {
			return A;
		}
		K= K-1;
		int[] B = new int[A.length];
		int b = 0;
		for(int a=0; a<A.length; a++) {
			if(a+K >= A.length) {
				B[a] = A[b];
				b++;
			}else {
				B[a] = A[a+K];				
			}
			
		}
		return B;
		
	}

}
