import java.util.Scanner;
public class Volume{
        /**
	 *@param args
	 */
	public static final PI = 3.1415927;
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println(Pls enter the value of radius);
		double r = s.nextDouble();
		double v;
		v = 4*PI*Math.pow(r,3)/3;
		System.out.println("The Volume is:"+v);
	}
}
