class addTwoNumber {
  int sum = 0;

  public static int addTwoInt(int a, int b){

    // adding two integer value.
    int sum = a + b;

    //returning summation of two values.
    return sum;
  }
	public static void main (String[] args) {


		// calling addTwoInt() method to add two integer using instance created
		// in above step.
		int s =addTwoInt(1,2);
		System.out.println("Sum of two integer values :"+ s);

	}
}
