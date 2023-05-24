package documento;

import java.util.ArrayList;
import java.util.List;

public class ServicioValidacion {
  private List<IValidacion> lista = new ArrayList<IValidacion>();

  public ServicioValidacion() {
  }

  public void addDocumento(IValidacion d){
    lista.add(d);
  }

  public void validar(){
    for (IValidacion d: lista) {
      d.validar();
    }
  }
}
