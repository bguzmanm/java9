package interfaces2;

public class Run {
  public static void main(String[] args) {
    Auto miAuto = new Auto("BMW", "A43", 5);
    miAuto.conducir();
    miAuto.chocar();
  }
}
