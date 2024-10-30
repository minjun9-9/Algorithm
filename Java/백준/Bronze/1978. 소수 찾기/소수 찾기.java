import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a;
		int count = 0;
		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(st.nextToken());
			for (int j = 2; j <= a; j++) {
				if (j == a) {
					count++;
				}
				if(a % j == 0) {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
