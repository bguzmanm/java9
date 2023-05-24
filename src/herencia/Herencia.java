package herencia;

public class Herencia {

  public static void main(String[] agrs){
    Persona p = new Persona("Matías", "Pérez", 34);

    Profesor prof = new Profesor(1, "Pablo", "Polanco", 32);

    System.out.println(prof.mostrarNombreProfesor());

    Auxiliar aux = new Auxiliar();

    aux.setNombre("Robertito");
    aux.setApellido("Errazuriz");
    aux.setEdad(50);

  }
}
