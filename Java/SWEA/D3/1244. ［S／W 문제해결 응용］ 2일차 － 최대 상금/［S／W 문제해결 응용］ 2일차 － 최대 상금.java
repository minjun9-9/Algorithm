/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;import java.util.HashSet;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
static int max;
	static HashSet<String>[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1; i <= tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = (st.nextToken());
			char[] arr= s.toCharArray();
			int chg = Integer.parseInt(st.nextToken());
			
			max = 0;
			
			visited = new HashSet[11];
            for(int j = 0; j <= 10; j++) {
                visited[j] = new HashSet<>();
            }

			
			change(arr, chg);
			
			System.out.println("#" + i +" " + max);
			
		}
	}
	private static void change(char[] arr, int chg) {
		// TODO Auto-generated method stub
		if(chg == 0) {
			int num = Integer.parseInt(new String(arr));
			max = Math.max(max, num);
			return;
		}
		
		String key = new String(arr);

        if(visited[chg].contains(key)) return;
        visited[chg].add(key);

		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
					swap(arr, i, j);
					change(arr, chg - 1);
					swap(arr, i, j);
			}
		}
	}
	private static void swap(char[] arr, int i, int j) {
		// TODO Auto-generated method stub
		char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
	}
}