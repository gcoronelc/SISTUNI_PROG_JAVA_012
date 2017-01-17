package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Persona {

  private String nombre;
  private int edad;
  private boolean casado;

  /**
   * Constructor por defecto.
   */
  public Persona() {
    /*
    this.nombre = "Claudia";
    this.edad = 25;
    this.casado = false;
    */
    this("Claudia", 26, false);
    System.out.println("Hola Claudia");
  }

  /**
   * Constructor adicional.
   * 
   * @param nombre Nombre de la persona.
   */
  public Persona(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Constructo adicional.
   * 
   * @param nombre Nombre de la persona.
   * @param edad Edad de la persona.
   */
  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  /**
   * Constructor adicional.
   * 
   * @param nombre Nombre de la persona.
   * @param edad Edad de la persona.
   * @param casado Estado civil de la persona.
   */
  public Persona(String nombre, int edad, boolean casado) {
    this.nombre = nombre;
    this.edad = edad;
    this.casado = casado;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public boolean isCasado() {
    return casado;
  }

  public void setCasado(boolean casado) {
    this.casado = casado;
  }

}
