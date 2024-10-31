import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		int[] list = new int[t];
		for(int i = 0; i < t; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		for(int i = 0; i < t; i++) {
			System.out.println(list[i]);
		}
	}

}
