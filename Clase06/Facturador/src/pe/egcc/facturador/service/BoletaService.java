package pe.egcc.facturador.service;

import pe.egcc.facturador.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public class BoletaService extends CompAbstract {

  @Override
  public Item[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Reporte
    Item[] repo = {
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral),};
    return repo;
  }

}
