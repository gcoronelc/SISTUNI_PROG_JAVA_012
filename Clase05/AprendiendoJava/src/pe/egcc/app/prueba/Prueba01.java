package pe.egcc.app.prueba;

import pe.egcc.app.model.Venta;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    System.out.println("IGV: " + Venta.igv);
    
    Venta v1 = new Venta();
    v1.nombre = "Gustavo";
    v1.importe = 5680.0;
    v1.igv = 0.17;
    
    Venta v2 = new Venta();
    v2.nombre = "Juan";
    v2.importe = 340.0;
    v2.igv = 0.23;
    
    Venta v3 = new Venta();
    v2.nombre = "Claudia";
    v2.importe = 123.0;
    v2.igv = 0.33;
    
    mostrar(v1);
    mostrar(v2);
    mostrar(v3);
    
  }

  private static void mostrar(Venta o) {
    System.out.println("-----------------");
    System.out.println("Nombre: " + o.nombre);
    System.out.println("Importe: " + o.importe);
    System.out.println("IGV: " + o.igv);
  }
  
}
