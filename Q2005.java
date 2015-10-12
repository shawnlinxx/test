import java.util.Data;
import java.util.Scanner;
import java.util.Calendar;
public class Data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Date date = new Date(str);
		Calender cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println("day"+cal.get(Calendar.DAY_OF_YEAR));
	}
}


public class Data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dd = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		while(sc.hasNext()){
			int days = 0;
			String str = sc.nextLine();
			String[] date = str.split("/");
			int y = Integer.parseInt(date[0]);
			int m = Integer.parseInt(date[1]);
			int d = Integer.parseInt(date[2]);
			if((y%400 == 0 || (y%4 == 0 && y%100 !=0)) && m>2)
				days += d;
			for(int i=0;i<m;i++){ 
				days += dd[i];
			}
			System.out.println(days);
		}
	}
}
