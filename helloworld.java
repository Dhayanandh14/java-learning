

// Creating thread by creating the
// objects of that class
class ThreadJoining extends Thread
{

	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Current Thread: "
						+ Thread.currentThread().getName());
			}

			catch(Exception ex)
			{
				System.out.println("Exception has" +
								" been caught" + ex);
			}
			System.out.println(i);
		}
	}
}
public class helloworld {
		public static void main(String args[]) {
			ThreadJoining t1 = new ThreadJoining();
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
