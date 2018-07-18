public class Test{
  public static void main(String[] args) {
    Test1 obj ;
    obj = new Test1();
    obj.disp();
    obj = new Test1();
    obj.disp();
    obj = new Test1(20);
    obj.disp();
    obj = new Test1(30);
    obj.disp();
    
  }
}
class Test1{
  int a;
   private Test1(){
    a = 10;
  }
  Test1(int x){
    a = x;
  }
  void disp(){
    System.out.println("helloworld..! " + a);
  }
}