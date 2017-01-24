package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      System.out.println(i + "\t" + MyMath.factorial(i));
    }
  }
}
