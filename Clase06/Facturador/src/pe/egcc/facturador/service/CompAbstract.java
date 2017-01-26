package pe.egcc.facturador.service;

import pe.egcc.facturador.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class CompAbstract {
  
  public static final double IGV = 0.18;
  public static final double SERVICIO = 0.10;
  
  public abstract Item[] procesar(double total);
  
}
