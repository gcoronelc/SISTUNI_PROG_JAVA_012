package pe.egcc.mateapp.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    int a = 4;
    int b = 5;
    
    //b = b * a;
    
    b *= a--;
    
    
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
  
}
