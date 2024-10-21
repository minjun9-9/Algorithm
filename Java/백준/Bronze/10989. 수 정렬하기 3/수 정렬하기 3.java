import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
//		int[] arr = new int[N];
//		
//		for (int i = 0 ; i < N; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		for (int i = 0 ; i < N; i++) {
//			
//			bw.write(arr[i]+"\n");
//			bw.flush();
//		}
//		bw.close();
		
		//1번 : 배열 10000개 넣고 하기
		int[] cnt = new int[10001];
		for(int i = 0; i < N; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		for (int i = 0; i <= 10000; i++)
			while(cnt[i]-- > 0){
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
		
	}

}
