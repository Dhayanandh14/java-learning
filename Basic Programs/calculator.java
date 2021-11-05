import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter First number: ");
		int first_number = kbd.nextInt();
		System.out.print("Enter Second number: ");
		int second_number = kbd.nextInt();
		
		System.out.println(" Enter one of the mentioned operators (+, -, *, /): ");
		String symbols = kbd.next();
//		if (symbols == "+"){
//				System.out.print(first_number + second_number);
//		}
		switch(symbols) {
		case "+": System.out.print(first_number + second_number); break;
		case "-": System.out.print(first_number - second_number); break;
		case "*": System.out.print(first_number * second_number); break;
		case "/": System.out.print(first_number / second_number); break;
		 default: System.out.print("Please enter one of the mentioned operators.");
		return;
		}

	}

}
