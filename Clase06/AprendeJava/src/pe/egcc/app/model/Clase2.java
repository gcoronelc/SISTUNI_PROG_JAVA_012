package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase2 extends Clase1 {
  
  public String nombre = "Gustavo";

  public Clase2() {
    super("Gustavo");
    System.out.println("Todos somos Java Corazón.");
    System.out.println("Nombre Clase Padre: " + super.nombre);
    System.out.println("Nombre Clase Hija: " + nombre);
  }

  @Override
  public int sumar(int n1, int n2) {
    int s;
    s = (n1 + n2) * (n1 - n2);
    return s;
  }

  public int multiplicar(int n1, int n2) {
    int p;
    p = n1 * n2;
    return p;
  }

}
