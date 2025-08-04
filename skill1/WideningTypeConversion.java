package skill1;
import java.util.Scanner;
public class WideningTypeConversion {

	public static void main(String[] args) {
		        int x;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter the value of x ");
		        x=sc.nextInt();
		        long y=x;
		        float z=x;   
		        System.out.println("Original int value: " +x);
		        System.out.println("After widening to long: " +y);
		        System.out.println("After widening to float: " +z);
		        if ((int) z==x) {
		            System.out.println(" No data loss in widening conversion.");
		        } else {
		            System.out.println("Data was lost during conversion.");
		        }
		    }
		}
