public class constructor_overloading {
  int id;
  string name;
  int age;
  string gender;
  //creating two arg constructor
  constructor_overloading(int i,string n){
  id = i;
  name = n;
  }
  //creating three arg constructor
  constructor_overloading(int i,string n,int a){
  id = i;
  name = n;
  age=a;
  }
  constructor_overloading(int i,string n,int a , string g){
  id = i;
  name = n;
  age=a;
  gender = g;
  }
  void display(){System.out.println(id+" "+name+" "+age +" "+gender);}

  public static void main(string args[]){
  constructor_overloading s1 = new constructor_overloading(111,"Karan");
  constructor_overloading s2 = new constructor_overloading(222,"Aryan",25);
  constructor_overloading s3 = new constructor_overloading(222,"Aryan",30,"Male");
  s1.display();
  s2.display();
  s3.display();
 }
}
