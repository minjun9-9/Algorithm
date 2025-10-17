import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String con = br.readLine();
		StringTokenizer st = new StringTokenizer(con);
		int num = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int res = 0;
		int[] man = new int[6];
		int[] woman = new int[6];
		for(int i = 0; i < num; i++) {
			String s = br.readLine();
			StringTokenizer st2 = new StringTokenizer(s);
			int gender = Integer.parseInt(st2.nextToken());
			int grade = Integer.parseInt(st2.nextToken());
			if(gender == 1) {
				man[grade-1]++;
			}
			if(gender == 0) {
				woman[grade-1]++;
			}
		}
		for(int i = 0; i < 6; i++) {
			res += (man[i] + k -1)/k;
			res += (woman[i] + k -1)/k;
		}
		System.out.println(res);
	}

}
