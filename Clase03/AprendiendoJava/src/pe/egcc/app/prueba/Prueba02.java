package pe.egcc.app.prueba;

import pe.egcc.app.model.Persona;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    Persona obj = new Persona("Gustavo");
    mostrar(obj);
  }
  
  private static void mostrar(Persona obj) {
    System.out.println("---------------");
    System.out.println("Nombre: " + obj.getNombre());
    System.out.println("Edad: " + obj.getEdad());
    System.out.println("Casado: " + obj.isCasado());
  }
  
}
