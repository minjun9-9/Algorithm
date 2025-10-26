import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+1];
		int[] pre = new int[N+1];
		for(int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
			pre[i] = pre[i-1] + arr[i];
		}
		for(int i = 0; i < M; i++) {
			int fv = sc.nextInt();
			int lv = sc.nextInt();
			int val = 0;
			val = pre[lv] - pre[fv-1];
			System.out.println(val);
		}
	}

}
