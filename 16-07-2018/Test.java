public class Test{
  public static void main(String [] args)  {  // driver of  java
    System.out.println("Hello World");
    //Test1 obj1 = new Test1();   // creating instance for a class
    //obj1.disp(10);
    Test1.disp1(10);
  }
}

class Test1{
  void disp(int a){
    System.out.println(a);
  }
  static void disp1(int a){
    System.out.println(a);
  }
}

