import java.util.Scanner;
public class Q2010{
	/**
	 *@param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n,i;
		m = sc.nextInt();
		n = sc.nextInt();
		for(i = m;i <= n;i ++) {
			int ge,shi,bai;
			bai = i/100;
			shi = (1 - bai * 100)/10;
			ge = i - bai * 100 - shi * 10;
			if(i == bai * bai * bai + shi * shi * shi + ge * ge * ge)
				System.out.println(i);
		}
	}
}
