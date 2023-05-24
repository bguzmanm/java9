package documento;

public class DocumentoPDF extends Documento {

  private boolean protegido;

  public DocumentoPDF(String titulo) {
    super(titulo);
  }

  public DocumentoPDF(String titulo, boolean protegido) {
    super(titulo);
    this.protegido = protegido;
  }

  public boolean isProtegido() {
    return protegido;
  }
  public void setProtegido(boolean protegido) {
    this.protegido = protegido;
  }

  @Override
  public void validar() {
    System.out.println("El documento PDF con titulo " + getTitulo() + " ha sido validado");
  }
}
