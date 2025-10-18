import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr = new int[l+1];
		int[] max = new int[n+1];
		int expectMax = 0;
		int expectIdx = 0;
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int fst = Integer.parseInt(st.nextToken());
			int lst = Integer.parseInt(st.nextToken());
			
			int expect = lst - fst + 1;
			if(expect > expectMax) {
				expectMax = expect;
				expectIdx = i;
			}
			for(int j = fst; j <=lst; j++) {
				if(arr[j] == 0) {
					arr[j] = i;
					max[i]++;
				}
			}
		}
		
		int realMax = 0;
		int realIdx = 0;
		for(int i = 1; i<= n; i++	) {
			if(max[i] > realMax) {
				realMax = max[i];
				realIdx = i;
			}
		}
		System.out.println(expectIdx);
		System.out.println(realIdx);
	}

}
