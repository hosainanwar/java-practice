package Interface;

public class Eagle implements Bird {
  @Override
  public void move() {
    System.out.println("Eagle is moving");
  }

  @Override
  public void canFly() {
    System.out.println("Eagle can fly");
  }
}
