package pe.egcc.facturador.prueba;

import pe.egcc.facturador.model.Item;
import pe.egcc.facturador.service.CompAbstract;
import pe.egcc.facturador.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {


  public static void main(String[] args) {
    // Dato
    double total = 5460.0;
    // Proceso
    CompAbstract comp;
    comp = CompFactory.getComp(CompFactory.COMP_BOLETA);
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item i : repo) {
      System.out.println(i.getConcepto() + "\t" + i.getValor());
    }
  }
  
}
