package Interface;

public class Hen implements Bird, Nest{

  @Override
  public void move() {
    System.out.println("Hen can Move");
  }

  @Override
  public void canFly() {
    System.out.println("Hen cannot Fly");
  }
}
