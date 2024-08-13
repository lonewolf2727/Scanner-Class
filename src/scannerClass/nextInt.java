package scannerClass;

import java.util.Scanner;
public class nextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please an integer : ");
		int data = input.nextInt();
		
		System.out.println("Your integer is : "+data);
		input.close();

	}

}
