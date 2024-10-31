import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int e = 1;
		int s = 1;
		int m = 1;
		
		int count = 1;
		while(true) {
			if(E==e&&S==s&&M==m) break;
			if(e==15) {
				e=0;
			}
			if(s==28) {
				s=0;
			}
			if(m==19) {
				m=0;
			}
			e++;
			s++;
			m++;
			count++;
		}
		System.out.println(count);
		
		
	}

}
