/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;


public class Pago {
   private String nombreDeudor;
   private Date fechaDePago;

    public Pago(String nombreDeudor, Date fechaDePago) {
        this.nombreDeudor = nombreDeudor;
        this.fechaDePago = fechaDePago;
    }

    public Pago() {
    }
   
    public void autorizarPago(){
        
    }
    
    public void quitarImpuesto(Ciudadano c){
        
    }
}
