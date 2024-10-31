import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0;
		double a = 0;
		StringTokenizer st;
		for (int i = 0; i < 20; i++) {
			
			st = new StringTokenizer(br.readLine());
			String object = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String al = st.nextToken();
			double count = 0;
			
			if (!al.equals("P")) {
				switch (al) {
				case "A+":
					count =4.5;
					break;
				case "A0":
					count =4.0;
					break;
				case "B+":
					count =3.5;
					break;
				case "B0":
					count =3.0;
					break;
				case "C+":
					count =2.5;
					break;
				case "C0":
					count =2.0;
					break;
				case "D+":
					count =1.5;
					break;
				case "D0":
					count =1.0;
					break;
				case "F":
					count =0.0;
					break;
				default: break;
				}
				a+= score*count;
				sum += score;
			}
			
		}
		System.out.printf("%.6f",a/sum);
		br.close();
		
		
		
		
	}

}
