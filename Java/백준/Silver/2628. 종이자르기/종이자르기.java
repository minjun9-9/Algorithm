import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(br.readLine());

        List<Integer> wc = new ArrayList<>();
        List<Integer> hc = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0) wc.add(b);  // 가로 자르기
            else hc.add(b);         // 세로 자르기
        }

        wc.add(0);
        hc.add(0);
        wc.add(h);
        hc.add(w);

        Collections.sort(wc);
        Collections.sort(hc);

//        System.out.println("가로선들: " + wc);
//        System.out.println("세로선들: " + hc);

        int maxw = 0;
        int maxh = 0;

        for (int i = 1; i < wc.size(); i++) {
            int diff = wc.get(i) - wc.get(i - 1);
            if (diff > maxw) maxw = diff;
        }

        for (int i = 1; i < hc.size(); i++) {
            int diff = hc.get(i) - hc.get(i - 1);
            if (diff > maxh) maxh = diff;
        }

//        System.out.println("maxw: " + maxw);
//        System.out.println("maxh: " + maxh);
        System.out.println((maxw * maxh));
    }
}
