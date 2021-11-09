import java.util.*;
class Sqad{
	private int a,b,c;
	public int getone(){
		return a;
	}
	public int gettwo(){
		return b;
	}
	public int getthree(){
		return c;
	}
	public void set(int x,int y,int z){
		a=x;
		b=y;
		c=z;
	}
	public int sum(){
		int sq = a*a;
		int sq2=b*b;
		int sq3=c*c;
		int add = sq+sq2+sq3;
		return add;

	}

}
public class SquareandSum {

	public static void main(String[] args) {
		Sqad obj = new Sqad();
		obj.getone();
		obj.gettwo();
		obj.getthree();
		System.out.print("Enter Number: ");
		Scanner kbd = new Scanner(System.in);
		int n1=kbd.nextInt();
		int n2=kbd.nextInt();
		int n3=kbd.nextInt();
		obj.set(n1, n2, n3);
		System.out.println(obj.sum());
        kbd.close();
	}

}
