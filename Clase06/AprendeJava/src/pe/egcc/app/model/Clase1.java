package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase1 {
  
  public String nombre = "Claudia";

  public Clase1() {
    System.out.println("Hola Todos, java te hace feliz.");
  }
  
  public Clase1(String nombre) {
    System.out.println("Hola " + nombre);
  }
  
    
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

}
