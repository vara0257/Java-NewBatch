class BC{
  int a;
  void disp(){
    System.out.println("base class disp()");
  }
}

class IC{
  int c;
  void add(){
    System.out.println("intermediate class add()");
  }
}
class DC extends IC{
  int b;
  void show(){
    System.out.println("derived class show()");
    b = 20;
    a = 10;
    System.out.println("at disp(): " + b);
  }
}
public class InhPgm1{
  public static void main(String[] args) {
    DC obj1 = new DC();
    System.out.println(obj1.a);
    System.out.println(obj1.b);
    obj1.disp();
    obj1.show();
  }
}