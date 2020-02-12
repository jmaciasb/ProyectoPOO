
package control;

import java.util.Date;
import modelo.Ciudadano;
import modelo.Impuesto;


public class AdministrarImpuestos {
    
    Date venP = new Date(120,0,11);
    Date venR = new Date(120, 1, 15);
    
    public void crearImpuestoPredial(Ciudadano c){
       Impuesto imp = new Impuesto(c.getNombre(), 0,venP,"predial"); 
       double tarifaF = 0;
       if (c.getAvaluo()<352384000)
           tarifaF = c.getAvaluo()*5.5/1000;
       if (c.getAvaluo()>352384000 && c.getAvaluo() < 785885000)
           tarifaF = c.getAvaluo()*6.5/1000;
       if (c.getAvaluo()>785885000)
           tarifaF = c.getAvaluo()*8.6/1000;
       imp.setValor(tarifaF); 
       c.getImpuestos().add(imp);
    }
    
    public void crearImpuestoRenta (Ciudadano c){
        double rango = c.getIngresos()*12/34270;
        double tarifaF = 0;
        Impuesto imp2 = new Impuesto(c.getNombre(),0, venR, "Renta");
        if (rango>1090 && rango <4100){
            tarifaF = rango-1090*0.19;
        }
        if(rango > 4100 && rango<18970){
            tarifaF = rango-4100*0.35;
        }
        if(rango>18970){
            tarifaF = rango-18970*0.39;
        }        
        imp2.setValor(tarifaF); 
        c.getImpuestos().add(imp2);
             
        
    }
    
}
