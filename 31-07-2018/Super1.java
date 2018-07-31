class BC{
  int a=10;
  void disp(){
    System.out.println("BC disp()");
  }
}
class DC extends BC{
  int b;
  int a=100;
  void show(){
    System.out.println("DC show() => " + super.a);
  }
  void disp(){
    super.disp();
    System.out.println("DC disp()");
  }
}
public class Super1{
  public static void main(String[] args) {
    // 
    DC obj = new DC();
    System.out.println(obj.a);
    obj.disp();
    // indirect 
    BC obj1 = new DC();
    System.out.println("calling obj1 dis()");
    obj1.disp();
  }
}
