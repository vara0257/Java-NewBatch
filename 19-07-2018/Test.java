import java.util.Scanner;

public class Test{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter val: ");
    int a = s.nextInt();
    System.out.println("value entered: " + a);
    A obj = new A();
    obj.sum(1,2);
  }
}

class A{
  int a,b;
  void sum(int a, int b){
    a = a;
    this.b = b;
    System.out.println(this.a + " | " + this.b);
    System.out.println(a + " | " + b);
  }
}