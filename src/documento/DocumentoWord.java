package documento;

public class DocumentoWord extends Documento {
  private String version;

  public DocumentoWord(String titulo, String version) {
    super(titulo);
    this.version = version;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public void validar() {
    System.out.println("El documento Word con título " + this.getTitulo() + " ha sido validado");
  }
}
