import java.util.Scanner;
public class Q2009 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the n");
		int n =in.nextInt();
		System.out.println("Enter the m");
		int m =in.nextInt();
		int add =n;
		for(int i=1;i<=m;i++) {
			add += Math.sqrt(n);
		}
		System.out.println("The result is:"+add);
}
