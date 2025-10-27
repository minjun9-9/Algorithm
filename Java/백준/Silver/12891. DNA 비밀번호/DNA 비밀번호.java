import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String password = br.readLine();
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int res = 0;
        int[] arr = new int[4];

        for (int i = 0; i < P; i++) {
            if (password.charAt(i) == 'A') arr[0]++;
            else if (password.charAt(i) == 'C') arr[1]++;
            else if (password.charAt(i) == 'G') arr[2]++;
            else arr[3]++;
        }

        if (arr[0] >= A && arr[1] >= C && arr[2] >= G && arr[3] >= T) res++;

        for (int i = P; i < S; i++) {
            char remove = password.charAt(i - P);
            char add = password.charAt(i);

            if (remove == 'A') arr[0]--;
            else if (remove == 'C') arr[1]--;
            else if (remove == 'G') arr[2]--;
            else arr[3]--;

            if (add == 'A') arr[0]++;
            else if (add == 'C') arr[1]++;
            else if (add == 'G') arr[2]++;
            else arr[3]++;

            if (arr[0] >= A && arr[1] >= C && arr[2] >= G && arr[3] >= T) res++;
        }

        System.out.println(res);
    }
}
