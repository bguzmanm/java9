package interfaces1;

public class Felino implements Mamifero {
  @Override
  public void amamantar() {
    System.out.println("soy un felino y estoy amamantando");
  }

  @Override
  public void gestar() {
    System.out.println("soy un felino, y estoy gestando");
  }
}
