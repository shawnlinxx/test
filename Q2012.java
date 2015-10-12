import java.util.Scanner;
public class Prime {
	public static boolean isPrime(int num) {
		for(int i = 2;i <= Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the first number");
		int x = sc.nextInt();
		System.out.println("Pls enter the second number");
		int y = sc.nextInt();
		if(x == 0 && y == 0)
			return;
		else {
			for(int i = x;i <= y; i++) {
				if(!Prime.isPrime(i))
				       System.out.println("Sorry!");
				}
			 System.out.println("OK!");
		}
	}
}
