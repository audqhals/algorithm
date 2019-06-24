package work;

public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 32;
		int result = run(N);
		System.out.println("result : " + result);
	}

	private static int run(int N) {
		String binary = Integer.toBinaryString(N);
		int length = 0;
		int cnt = 0;
		String[] binarySplit = binary.split("1");
		for(String item : binarySplit) {
			System.out.println("item_len : " + item);
			if(item.length() == 0) {
				cnt++;
			}
			if(item.length() > length) {
				length = item.length();
			}
		}
		if(cnt > 0 && binarySplit.length > 2) {
			return length;			
		}else {
			return 0;
		}
	}

}
