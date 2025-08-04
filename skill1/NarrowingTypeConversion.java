package skill1;
import java.util.Scanner;
public class NarrowingTypeConversion {

	public static void main(String[] args) {
		double a;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value");
		a=sc.nextDouble();
		int b;
		b=(int)a;
		System.out.println("Double value "+a);
		System.out.println("Integer value "+b);


	}

}
