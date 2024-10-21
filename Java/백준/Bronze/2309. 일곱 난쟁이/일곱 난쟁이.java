import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		int[] ans = new int[7];
		int sum = 0;
		int min = 0;
		for(int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		min = sum - 100;
		for(int i = 0; i < 9; i++) {
			for(int j = i+1; j<9; j++) {
				if(a[i]+a[j] == min) {
					int b = 0;
					for(int k = 0; k < 9; k++) {
						if(k != i && k != j)
							ans[b++] = a[k];
					}
				}
			}
		}
		Arrays.sort(ans);
		for(int i = 0; i < 7; i++) {
			System.out.println(ans[i]);
		}
	}
}
