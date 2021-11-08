public class stringbufferexample {
  public static void main(String args[]){
    StringBuffer name = new StringBuffer();
    name.append("Dhayanandh");
    System.out.println("Before Insert: "+name);
    name.insert(10," Parthiban");
    System.out.println("After Insert: "+name);
    System.out.println("String capacity: "+name.capacity());
    System.out.println("Reverse: "+name.reverse());
  }
}
