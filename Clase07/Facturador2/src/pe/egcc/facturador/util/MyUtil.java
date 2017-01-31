package pe.egcc.facturador.util;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyUtil {

  private MyUtil() {
  }
  
  public static boolean isDouble(String value){
    boolean ok;
    try {
      double n = Double.parseDouble(value);
      ok = true;
    } catch (Exception e) {
      ok = false;
    }
    return ok;
  }
  
}
