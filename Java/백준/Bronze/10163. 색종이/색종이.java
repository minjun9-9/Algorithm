import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		int[][] arr = new int[1001][1001];
		for(int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			for(int j = x; j < x + w; j++) {
				for(int k = y; k < y + h; k++) {
					arr[j][k] = i;
				}
			}
		}
		
		// 색종이가 차지하고 있는 면적 계산
		for(int i = 0; i < 1001; i++) {
			for(int j = 0; j < 1001; j++) {
				a[arr[i][j]]++;
			}
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.println(a[i]);
		}
	}
}
