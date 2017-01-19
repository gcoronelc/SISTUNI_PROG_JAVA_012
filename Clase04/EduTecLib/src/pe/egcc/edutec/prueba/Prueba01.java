package pe.egcc.edutec.prueba;

import pe.egcc.edutec.lib.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    MateService service = new MateService();
    System.out.println("Promedio: " + service.promedio(10, 12));
    System.out.println("Promedio: " + service.promedio(10, 12, 14));
    System.out.println("Promedio: " + service.promedio(10, 12, 14, 16));
    System.out.println("Promedio: " + service.promedio(10, 12, 14, 16, 18));
  }
  
}
