class BC{
  BC(){
    System.out.println("BC()");
  }
  BC(int x){
    System.out.println("BC(int)");
  }
}
class IBC extends BC{
  IBC(){
    //super();
    
    System.out.println("IBC()");
  }

  IBC(int x){
    super(10);
    System.out.println("IBC(int)");
  }
}
class DC extends IBC{
  DC(){
    //super();
    System.out.println("DC()");
  }
  DC(int x){
    //super(10);
    super();
    System.out.println("DC(int)");
  }
}

public class Super1{
  public static void main(String[] args) {
    DC obj = new DC(10);   
  }
}