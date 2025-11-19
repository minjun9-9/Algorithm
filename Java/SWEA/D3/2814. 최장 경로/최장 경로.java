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
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
static int n,m,res,x,y;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc = 1; tc <= t; tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			res = 0;
			
			arr= new ArrayList[n+1];
			
			for(int i = 1; i <= n; i++) {
				arr[i] = new ArrayList<>();
			}
			
			for(int i = 0; i < m; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				arr[x].add(y);
				arr[y].add(x);
				
			}
			
			for (int start = 1; start <= n; start++) {
                visited = new boolean[n + 1];
                dfs(start, 1); // count = 1: 시작 정점 포함
            }
			
			System.out.println("#"+tc+" "+res);
			
		}
	}
	private static void dfs(int node, int count) {
		// TODO Auto-generated method stub
		visited[node] = true;
		res = Math.max(res, count);
		
		for(int next:arr[node]) {
			if(!visited[next]) {
				dfs(next, count+1);
			}
		}
		
		visited[node] = false;
	}

}
