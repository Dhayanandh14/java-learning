public class parameter_constructor {
  public int a,b;
  parameter_constructor(int x,int y){
    a = x;
    b= y;
  }
  public void print(){
    System.out.println("Value of A: " +a);
    System.out.print("Value of b: " +b);
  }
  public static void main(string args[]){
    parameter_constructor obj = new parameter_constructor(10,5);
    obj.print();
  }
}
