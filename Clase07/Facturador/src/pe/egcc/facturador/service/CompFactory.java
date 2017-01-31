package pe.egcc.facturador.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class CompFactory {

  private CompFactory() {
  }

  // Tipos de comprobantes
  public final static String COMP_FACTURA = "Factura";
  public final static String COMP_BOLETA = "Boleta";

  public static String[] getTipos() {
    String[] tipos = {COMP_FACTURA, COMP_BOLETA};
    return tipos;
  }

  public static CompAbstract getComp(String tipo) {
    CompAbstract bean = null;
    switch (tipo) {
      case COMP_FACTURA:
        bean = new FacturaService();
        break;
      case COMP_BOLETA:
        bean = new BoletaService();
        break;
    }
    return bean;
  }

}
