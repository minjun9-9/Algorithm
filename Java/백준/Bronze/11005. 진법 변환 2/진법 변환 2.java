import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		br.close();
		// 1. N을 B로 나눈 나머지 구하고 B로 나누기
		// 2. 이떄 가장 마지막 나머지부터 가장 앞 자릿값이 된다.
		
//		ArrayList<Character> list = new ArrayList<Character>();
//		StringBuilder sb = new StringBuilder();
//		
//		while(N > 0) {
//			if(N%B < 10) {
//				sb.append((char)(N%B + '0'));
//			}
//			else {
//				sb.append((char)(N%B - 10 + 'A'));
//			}
//			N /= B;
//		}
//		System.out.println(sb.reverse().toString());
		System.out.println(Integer.toString(N,B).toUpperCase());
	}


}
