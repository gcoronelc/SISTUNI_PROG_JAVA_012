package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    Clase4 bean = new Clase4();
    System.out.println("7 + 5 = " + bean.sumar(7, 5));
    System.out.println("Nombre = " + bean.nombre);
  }
  
}
