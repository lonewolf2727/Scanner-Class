package scannerClass;

import java.util.Scanner;

public class next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String data = input.next();
		
		System.out.println("Text Entered : "+data);
		input.close();

	}

}
