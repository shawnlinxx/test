import java.util.Scanner;
public class odd{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,i,s;
		s = 1;
		n = sc.nextInt();
		for(i = 1;i <= n;i ++) {
			m = sc.nextInt();
			if(m % 2 != 0)
				s = s * m;
		}
		System.out.println("The result is:"+s);
	}
}
