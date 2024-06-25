import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		//how to take input from user
		//using Scanner class we will take input
		//System.in is use to take input and System.out is use to give output
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First No ");
		int i=sc.nextInt();
		
		System.out.println("Enter second no");
		int j=sc.nextInt();
		
		int c=i+j;
		
		System.out.println("Addition is "+c);
	}

}
