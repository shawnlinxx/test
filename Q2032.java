import java.util.Scanner;
public class triangle {
	public static void main(String[] agrs) {
		int a[5][5],i,j;
		for(i = 0;i < 5;i++) {
			for(j = 0;j < i;j++) {
				if(i == j || j == 1)
					a[i][j] = 1;
				else
					a[i][j] = a[i][j-1] + a[i - 1][j - 1];
				System.out.print(a[i][j]);
			}
			System.out.print('\n');
		}
	}
}
