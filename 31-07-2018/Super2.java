class BC{
  BC(){
    System.out.println("BC()");
  }
}
class IBC extends BC{
  IBC(){
    System.out.println("IBC()");
  }
}
class DC extends IBC{
  DC(){
    this(100);
    System.out.println("DC()");
  }
  DC(int x){
    
  }
}

public class Super2 {
  public static void main(String[] args) {
      DC obj = new DC();   
  }
}