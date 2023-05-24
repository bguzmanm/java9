package documento;

public class Video implements IValidacion {
  private String nombreArchivo;
  public Video() {
  }

  public Video(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo;
  }

  @Override
  public void validar() {
    System.out.println("El video ha sido validado");
  }
}
