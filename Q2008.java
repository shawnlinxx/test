import java.util.Scanner;
public class Q2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total No.");
		int n = sc.nextInt();
		int sum_zero = 0;
		int sum_positive = 0;
		int sum_negative = 0;
		int temp = 0;
		System.out.println("Enter the No. one by one");
		for(int i = 1;i <= n;i ++) {
			System.out.println("Enter No." +I+ ":")
				temp = sc.nextInt();
				if(temp < 0) {
					sum_negative++;
				} else if (temp > 0) {
					sum_positive++;
				} else {
					sum_zero++;
				}
		}
		System.out.println("Total_positive=" + sum_positive);
		System.out.println("Total_negative=" + sum_negative);
		System.out.println("Total_zero=" + sum_zero);
	}
}
