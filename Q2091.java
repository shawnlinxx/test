public class Test {
	public static void main(String[] args) {
		final int SIZE = 5;
		for(int i = 1;i <= SIZE;i++) {
			for(int j = 1;j <= SIZE - 1;j++) {
				System.out.print("");
			}
			for(int k = 1;k <= 2*i-1;k++) {
				if(i == SIZE)
					System.out.print("*");
				else if((k==1 || k==2*i-1) && i!= SIZE)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
