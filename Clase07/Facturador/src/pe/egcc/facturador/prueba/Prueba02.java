package pe.egcc.facturador.prueba;

import pe.egcc.facturador.model.Item;
import pe.egcc.facturador.service.BoletaService;
import pe.egcc.facturador.service.CompAbstract;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {


  public static void main(String[] args) {
    // Dato
    double total = 5460.0;
    // Proceso
    CompAbstract comp = new BoletaService();
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item i : repo) {
      System.out.println(i.getConcepto() + "\t" + i.getValor());
    }
  }
  
}
