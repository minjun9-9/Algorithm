import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int g ;
		int h ;
		br.close();
		if(a == c ) {
			g = e;
		}
		else if (a == e) g = c;
		else g = a;
		
		if(b == d) h = f;
		else if(b == f) h = d;
		else h = b;
		
		
		System.out.println(g+" "+h);
		
	}

}
