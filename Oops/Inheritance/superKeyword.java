public class superKeyword {
  public int a = 8;
  public string name = "Dhayanandh";
}
   class subclass extends superKeyword{
    string name = "Jack sparrow";
     void print(){
      System.out.print(super.name);
    }
  public static void main(string args[]){
    subclass obj = new subclass();
    obj.print();
  }
}
