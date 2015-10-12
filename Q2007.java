import java.util.Scanner;
public class Q2007{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,b,i,m;
		a = 0;
		b = 0;
		m = sc.nextInt();
		n = sc.nextInt();
		for(i = m;i <= n-m;i ++) {
			if(m % 2 !=0)
				a = a + i * i;
			else
				b = b + i * i * i;			
		}
		System.out.println("The result are:"+a +b);
}
