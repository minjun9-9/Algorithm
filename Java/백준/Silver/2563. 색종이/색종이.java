import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean[][] arr = new boolean[100][100];
		int area = 0;
	for(int i = 0 ; i < a; i++) {
		int n = sc.nextInt();
		int m = sc.nextInt();
			for (int j = n; j < n+10; j++) {
				for (int k = m; k < m+10; k++) {
					if(!arr[j][k]) {
						arr[j][k] = true;
						area++;
					}
				}
			}
			
		}
	System.out.println(area);
	}

}
