package scannerClass;

import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name");
		String value = input.nextLine();
		
		System.out.println("Your name is : "+value);
		input.close();

	}

}
