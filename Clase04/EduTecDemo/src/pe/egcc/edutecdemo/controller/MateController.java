package pe.egcc.edutecdemo.controller;

import pe.egcc.edutec.lib.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class MateController {
  
  private MateService service;

  public MateController() {
    service = new MateService();
  }
  
  public int promedio(int n1, int n2) {
    return service.promedio(n1, n2);
  }
  
}
