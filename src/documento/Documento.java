package documento;

public abstract class Documento implements IValidacion {

  private String titulo;

  public Documento(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public abstract void validar();
}
