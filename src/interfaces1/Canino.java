package interfaces1;

public class Canino implements Mamifero {
  @Override
  public void amamantar() {
    System.out.println("soy un canino, y estoy amamantando");
  }

  @Override
  public void gestar() {
    System.out.println("soy un canino, y estoy gestando");

  }
}
