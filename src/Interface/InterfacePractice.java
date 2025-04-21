package Interface;

public class InterfacePractice {
  public static void main(String[] args) {

    Hen henObj = new Hen();
    Bird eagleObj = new Eagle();
    henObj.print();
    eagleObj.canFly();
  }
}
