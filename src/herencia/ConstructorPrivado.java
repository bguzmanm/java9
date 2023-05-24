package herencia;

public class ConstructorPrivado {
  private String nombre;

  private ConstructorPrivado(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
