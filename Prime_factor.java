import java.util.Scanner;
public class Prime_factor {
	/*
	 * Test for the Prime factor
	 */
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == 0)
				break;
			factor(num);
		}
	}
	
	public static void factor(int number) {
		if(isPrime(number)) 
			System.out.print(number+" can not factor\n");
		else {
			for(int i=2;i < number;i++) {
				if(number % i == 0) {
					System.out.print(i+"\t");
					int num = number / i;
					if(isPrime(num))
						System.out.print(num+"\n");
					else
						factor(num);
				}
				return;
			}
		}
	}
	
	static boolean isPrime(int number) {
		boolean flag = true;
		for(int i=2;i <= Math.sqrt(number);i++) {
			if(number % i == 0)
				flag = false;
		}
		return flag;
	}
}
