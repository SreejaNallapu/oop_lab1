package lab1;
import java.util.Scanner;

public class Square_rootof_allnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            result=Math.sqrt(i);
            System.out.printf("Square root of "+i+" is "+result+"\n" );
        }
	}
}
