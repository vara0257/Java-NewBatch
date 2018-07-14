class Test{
  public static void main(String[] args) {
    System.out.println("Started...");
    //sum(10);  // method call
    int b = sum(20);
    System.out.println(b);
    //sum(1.1);
    //sum(1.1f, 1);
    //sum(1, 1.1f);
    System.out.println("ended..");
  }
  static int sum(int a){
    System.out.println(a);  // method body
    return a;
  }
  static void sum(float a){
    System.osut.println(a);  // method body
  }
  static void sum(float a, int b){
    System.out.println(a + " | " + b);  // method body

  }
}

static int sum(int a){
  System.out.println(a);  // method body
  return a;
}