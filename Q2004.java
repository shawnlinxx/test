import java.util.Scanner;
public class Q4{
        /**
	 *          * @param args
	 *                   */
	public static String change(int t) {
		if (t >= 0 && t < 60) {
			return "E";
		} else if (t >= 60 && t < 70) {
			return "D";
		} else if (t >= 70 && t < 80) {
			return "C";
		} else if (t >= 80 && t < 90) {
			return "B";
		} else if (t >= 90 && t <= 100) {
			return "A";
		} else {
			return "Score is error!";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input a Score:");
		int t = 0;
		try {
			t = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Score is error!");
			return;
		}
		System.out.println(change(t));
	}
}
