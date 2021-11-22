public class Animal {
  void eat(){System.out.println("eating...");}
  }
  class Dog extends Animal{
  void bark(){System.out.println("Dog will bark");}
  }
  class Cat extends Animal{
  void meow(){System.out.println("meow meow");}
  }
  class TestInheritance3{
  public static void main(string args[]){
  Cat c=new Cat();
  Dog d =new Dog();
  c.eat();
  d.bark();
  c.meow();
  }}
