import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < a; i++) {
			int n = Integer.parseInt(st.nextToken());
			arr.add(i-n, i+1);
			
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
