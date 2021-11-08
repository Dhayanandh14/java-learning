public class performancetest {

 // A basic Java program that compares the performance of StringBuffer and
 // StringBuilder
 // main method
 public static void main(String argvs[])
 {
 long sTime = System.currentTimeMillis();
 // creating an object of StringBuffer
 StringBuffer strBuffer = new StringBuffer("Hi ");
 for (int j = 0; j < 10000; j++)
 {
      // doing the concatenation work
     strBuffer.append("Tutorial & Example");
 }
 // displaying the time taken by StringBuffer
 System.out.println("Total Time consumed by the StringBuffer is: " + (System.currentTimeMillis() - sTime) + "ms");
 // resetting the start time
 sTime = System.currentTimeMillis();
 // creating an object of StringBuilder
 StringBuilder strBuilder = new StringBuilder("Hi ");
 for (int j = 0; j < 10000; j++)
 {
      // doing the concatenation work
     strBuilder.append("Tutorial & Example");
 }
 // displaying the time taken by StringBuilder
 System.out.println("Total Time consumed by the StringBuilder is: " + (System.currentTimeMillis() - sTime) + "ms");
 }
 }
