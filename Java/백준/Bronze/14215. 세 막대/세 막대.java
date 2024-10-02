import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		int count = 0;
		Arrays.sort(a);
		
		
			if (a[2] < a[0] + a[1]) {
				System.out.println(a[2]+a[0]+a[1]);
			}
			else {
				System.out.println((a[1]+a[0])*2-1);
			}
			
	}

}
