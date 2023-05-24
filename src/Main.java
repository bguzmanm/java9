import documento.*;

public class Main {
  public static void main(String[] args) {
    DocumentoPDF pdf = new DocumentoPDF("El documento pdf", false);
    DocumentoWord word = new DocumentoWord("Tesis final final", "final");
    DocumentoWord word2 = new DocumentoWord("Tesis final final esta si", "esta");

    Video v = new Video("video_oculto.mp4");

    Json js = new Json();

    ServicioValidacion sv = new ServicioValidacion();
    sv.addDocumento(pdf);
    sv.addDocumento(word);
    sv.addDocumento(word2);
    sv.addDocumento(v);
    sv.addDocumento(js);

    sv.validar();

  }
}