import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int a = Integer.parseInt(br.readLine());
			
			if(a == -1) {break;
			
			}
			
			int[] array = new int[a];
			
			int sum = 0;
			
			for (int i = 1; i <= a; i++) {
				if (a % i == 0 && i != a) {
					array[i] = i;
					sum += i;
				
				}
			}
			
			if (sum != a) {
				sb.append(a+" is NOT perfect. \n");
				continue;
			}
			
			sb.append(a + " = 1");
			
			for (int i = 1; i <= a; i++) {
				if (array[i-1] != 0 && array[i-1] !=1) {
					sb.append(" + " + array[i-1]);
				}
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
	}

}
