package herencia;

public class Profesor extends Persona {

  private int idProfesor;

  public Profesor(int id, String nombre, String apellido, int edad) {
    super(nombre, apellido, edad);
    this.idProfesor = id;
  }

  public int getIdProfesor() {
    return idProfesor;
  }

  public void setIdProfesor(int idProfesor) {
    this.idProfesor = idProfesor;
  }

  public String mostrarNombreProfesor(){
    return "Prof." + this.getNombre() + " " + this.getApellido();
  }
}
