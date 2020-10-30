package labass4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Evenodd 
{
	public static void main(String[] args) {
		int n=-1;
		boolean isOdd=false;
		do {
			System.out.println("Please enter a number or enter -1 if you want to quit");
			Scanner sc=new Scanner(System.in);
			try {
			    n=sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("You must enter an integer");
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			isOdd=checkOddNo(n);
			if(isOdd) {
				System.out.println("You have entered an odd number");
			}
			else {
				System.out.println("You have entered an even number");
			}
		}while(n!=-1);
	}
	private static boolean checkOddNo(int n)
	{
		return n%2!=0;
		
	}
	

}
