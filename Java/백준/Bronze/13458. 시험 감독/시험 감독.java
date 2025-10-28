
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int B = sc.nextInt();
		int C = sc.nextInt();
		long count = 0;
		for(int i = 0; i < arr.length; i++) {
			int res = arr[i];
			res -= B;
			count++;
			if(res > 0) {
				count += (res+C-1)/C;
			}
		}
		System.out.println(count);
	}

}
