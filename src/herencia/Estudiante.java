package herencia;

public class Estudiante extends Persona{

  private int idEstudiante;
  private String apoderado;

  public Estudiante() {
  }

  public Estudiante(int idEstudiante, String apoderado) {
    this.idEstudiante = idEstudiante;
    this.apoderado = apoderado;
  }

  public Estudiante(String nombre, String apellido, int edad, int idEstudiante, String apoderado) {
    super(nombre, apellido, edad);
    this.idEstudiante = idEstudiante;
    this.apoderado = apoderado;

  }
}
