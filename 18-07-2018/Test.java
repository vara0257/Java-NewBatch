public class Test{
  public static void main(String ... args){
    System.out.println("hello world");
    A obj = new A();
    obj.sum(1,2,3);
  }
}

class A
{
  void sum(int c, int b , int ... a)
  {
    int sum = 0;
    for(int i =0 ; i < a.length; i++){
      sum = sum + a[i];
    }
    System.out.println("sum of varags: " + sum);
    System.out.println("string of args: " + b);
  }
}