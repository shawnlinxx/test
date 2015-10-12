import java.util.Scanner;
public class Q1 {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Pls enter the first location");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		System.out.println("Pls enter the second location");
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int distance = (int) Math.sqrt(Math.abs((x1 - x2)*(x1 - x2))+Math.abs((y1 - y2)*(y1 - y2)));
		system.out.println("Distance is:"+distance);
	}
}
