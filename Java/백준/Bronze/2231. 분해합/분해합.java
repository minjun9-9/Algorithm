import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = 0;
		for(int i = 1; i <= N; i++) {
			int number = i;
			int res = 0;
			
			while(number > 0) {
				res += number % 10;
				number /= 10;
			}
			
			if(N == (i + res)) {
				M= i;
				break;
			}
			
		}
		System.out.println(M);
		
	}

}
