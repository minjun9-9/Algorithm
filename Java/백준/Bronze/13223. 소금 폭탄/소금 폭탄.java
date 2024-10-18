import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String start = sc.nextLine();
		String drop = sc.nextLine();
		
		int startHour = ((start.charAt(0)-'0')*10)+(start.charAt(1)-'0');
		int startMinute = ((start.charAt(3)-'0')*10)+(start.charAt(4)-'0');
		int startSecond = ((start.charAt(6)-'0')*10)+(start.charAt(7)-'0');

		int dropHour = ((drop.charAt(0)-'0')*10)+(drop.charAt(1)-'0');
		int dropMinute = ((drop.charAt(3)-'0')*10)+(drop.charAt(4)-'0');
		int dropSecond = ((drop.charAt(6)-'0')*10)+(drop.charAt(7)-'0');
		int hour = dropHour - startHour;
		int minute = dropMinute - startMinute;
		int second = dropSecond - startSecond;
		if(second < 0) {
			second+=60;
			minute--;
		}
		if(minute < 0) {
			minute+=60;
			hour--;
		}
		if(hour < 0) {
			hour+=24;
		}
		if (start.equals(drop)) {
			System.out.println("24:00:00");
		} else {
			System.out.printf("%02d:%02d:%02d",hour,minute,second);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
