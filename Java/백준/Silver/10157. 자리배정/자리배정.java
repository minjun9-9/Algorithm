import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		 if (K > C * R) {
	            System.out.println(0);
	            return;
        }
		 int[][] arr = new int[R][C];
		 int[] dx = {-1,0,1,0}; 
		 int[] dy = {0,1,0,-1};
		 
		 int dir = 0;
		 int x = R - 1;
		 int y = 0;
		 int num = 1;
		 arr[x][y] = num;
		 while (num < K) {
	            int nx = x + dx[dir];
	            int ny = y + dy[dir];

	            if (nx < 0 || ny < 0 || nx >= R || ny >= C || arr[nx][ny] != 0) {
	                dir = (dir + 1) % 4;
	                nx = x + dx[dir];
	                ny = y + dy[dir];
	            }

	            x = nx;
	            y = ny;
	            arr[x][y] = ++num;
	        }

	        System.out.println((y + 1) + " " + (R - x));
	}

}
