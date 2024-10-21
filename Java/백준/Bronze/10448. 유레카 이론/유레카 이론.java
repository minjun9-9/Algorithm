import java.util.Scanner;

public class Main {
	static boolean[] isEurekaNumber = new boolean[1001];
	
//	public static void preprocess() {
//		int[] triangleNumbers = new int[50];
//		int triangleNumberCount = 0;
//		for(int i = 1; ; i++) {
//			int triangleNumber = i * (i+1)/2;
//			if(triangleNumber >= 1000)break;
//			triangleNumbers[triangleNumberCount++] = triangleNumber;
//		}
//		
//		boolean[] isSumofTriangleNumber = new boolean[1001];
//		for (int i = 0; i < triangleNumberCount; i++) 
//			for(int j = 0; j< triangleNumberCount; j++) {
//				int sum = triangleNumbers[i] + triangleNumbers[j];
//				if (sum < 1000) isSumofTriangleNumber[sum] = true;
//			}
//			
//			for(int i = 1; i< 1000; i++) {
//				if(!isSumofTriangleNumber[i]) continue;
//				for(int j = 0; j < triangleNumberCount; j++) {
//					int sum =  i + triangleNumbers[j];
//					if(sum <= 1000) isEurekaNumber[sum] = true;
//				}
////			}
//			
//		
//		
//		
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		preprocess();
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		while(T-- > 0) {
//			int K = sc.nextInt();
//			System.out.println(isEurekaNumber[K] ? "1" : "0");
//		}
//	}
	
	public static void Triangle() {
		int[] tri = new int[45];
		int triCount = 0;
		for(int i = 1; ; i++) {
			int triNum = i*(i+1)/2;
			if(triNum > 1000)break;
			
			tri[triCount++] = triNum;
		}
	for(int i = 0; i < triCount; i++) {
		for(int j = 0; j < triCount; j++) {
			for(int k = 0; k <triCount; k++) {
				int sum = tri[i]+tri[j]+tri[k];
				if (sum <= 1000) isEurekaNumber[sum] = true;
			}
		}
	}
	
	}
	public static void main(String args[]) {
		Triangle();
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0) {
			int K = sc.nextInt();
			System.out.println(isEurekaNumber[K] ? "1" : "0");
		}
	}
}
