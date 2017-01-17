package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    PagoDto dto = new PagoDto(5, 25, 70.0);
    // Proceso
    PagoService service = new PagoService();
    service.procesar(dto);
    // Reporte
    System.out.println("Inresos: " + dto.getIngresos());
    System.out.println("Inresos: " + dto.getRenta());
    System.out.println("Inresos: " + dto.getNeto());
  }
  
}
