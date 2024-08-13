package scannerClass;

import java.util.Scanner;

public class nextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please a double value : ");
		double data = input.nextInt();
		
		System.out.println("Your double is : "+data);
		input.close();

	}

}
