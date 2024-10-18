import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String current = sc.nextLine();
		String drop = sc.nextLine();
		
		String[] currentUnit = current.split(":");
		int currentHour = Integer.parseInt(currentUnit[0]);
		int currentMinute = Integer.parseInt(currentUnit[1]);
		int currentSecound = Integer.parseInt(currentUnit[2]);
		int currentSecondAmount = currentHour*3600+currentMinute*60+currentSecound;
		String[] dropUnit = drop.split(":");
		int dropHour = Integer.parseInt(dropUnit[0]);
		int dropMinute = Integer.parseInt(dropUnit[1]);
		int dropSecound = Integer.parseInt(dropUnit[2]);
		int dropSecondAmount = dropHour*3600+dropMinute*60+dropSecound;
		
		int needSecondAmount = dropSecondAmount - currentSecondAmount;
		if(needSecondAmount <= 0) {
			needSecondAmount += 24*3600;
		}
		
		int needHour = needSecondAmount / 3600;
		int needMinute = needSecondAmount % 3600 / 60;
		int needSecond = needSecondAmount % 60;
		
		System.out.printf("%02d:%02d:%02d",needHour,needMinute,needSecond);
	}

}
