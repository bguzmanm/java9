package interfaces2;

public class Auto extends Vehiculo implements IVehiculo {

  private int cantidadPuertas;

  public Auto(String marca, String modelo) {
    super(marca, modelo);
  }

  public Auto(String marca, String modelo, int cantidadPuertas) {
    super(marca, modelo);
    this.cantidadPuertas = cantidadPuertas;
  }

  public int getCantidadPuertas() {
    return cantidadPuertas;
  }

  public void setCantidadPuertas(int cantidadPuertas) {
    this.cantidadPuertas = cantidadPuertas;
  }

  @Override
  public void conducir() {
    System.out.println("conduzco el auto " + this.getMarca() + " " + this.getModelo());
  }

  @Override
  public void chocar() {
    System.out.println("choco el auto " + this.getMarca() + " " + this.getModelo());
  }
}
