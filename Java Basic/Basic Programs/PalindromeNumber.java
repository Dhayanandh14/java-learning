import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter Palindrome Number: ");
		int num = kbd.nextInt();
		int s=num;
		int b = 0,temp = 0;
		for(;num!=0;){
			 b = num%10;//1//2
			 temp=(temp*10)+b;//1//10+2=12
			 num=num/10;//12//1
		}
		if(temp==s){
			System.out.print(s+" Is Palindrome Number");
		}
		else{
			System.out.print(s+" Not a palindrome Number");
		}
	kbd.close();

	}

}
