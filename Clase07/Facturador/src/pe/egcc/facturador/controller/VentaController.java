package pe.egcc.facturador.controller;

import pe.egcc.facturador.model.Item;
import pe.egcc.facturador.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaController {

  public String[] getTipos() {
    return CompFactory.getTipos();
  }

  public Item[] procesar(String tipo, double total) {
    return CompFactory.getComp(tipo).procesar(total);
  }

}
