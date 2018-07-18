public class InstanceBlocks1 {
  public static void main(String[] args) {
    A a = new A();
    A a1 = new A(10);
  }
}

class A{
  {
    System.out.println("creating an object - 1");
  }
  {
    System.out.println("creating an object - 2 ");
  }
  A(){
    System.out.println("a()");
  }
  A(int a){
    System.out.println("a(int) " + a);
  }
  {
    System.out.println("creating an object - 3");
  }
}

