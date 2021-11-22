
public class exception {

	public static void main(String[] args) {
		int number[] = {1,2,3,4,5};
		try {
		System.out.print(number[9]);
		}catch(Exception e) {
			System.out.println("something went wrong");
		}finally {
		      System.out.println("The 'try catch' is finished.");
	    }

	}

}
