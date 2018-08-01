class A{
  int a,b;
  void sum(){
    System.out.println("sum() at A");
  }
}
class B extends A{
  void disp(){
    System.out.println("disp() at B");
  }
}
class C extends B{
  void show(){
    System.out.println("show() at C");
  }
  void disp(){
    System.out.println("disp() at C");
  }
}
public class DynamicBinding{
  public static void main(String[] args) {
      B obj1 = new C();
      obj1.show();
  }
}