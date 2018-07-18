public class StaticBlocks1 {
  static 
  {
    System.out.println("flag1");
  }
  static 
  {
    System.out.println("flag2");
  }
  public static void main(String[] args) {
    System.out.println("flag3");
  }
  static 
  {
    System.out.println("flag4");
  }
}