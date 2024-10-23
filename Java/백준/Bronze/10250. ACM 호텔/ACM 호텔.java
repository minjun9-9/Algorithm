import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();  
			
			int floor = N % H;
			int room = N / H + 1;
			
			if(floor == 0) {
				floor = H;
				room--;
			}
			System.out.println(floor*100+room);
		}
	}
	

}
