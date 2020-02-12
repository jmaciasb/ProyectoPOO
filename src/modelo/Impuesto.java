/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;


public class Impuesto {
   
    private String nombre;
    private long valor; 
    private Date fechaExpiracion;
    private String sujetoActivo;
    private String tipoImpuesto;

    public Impuesto() {
    }

    public Impuesto(String nombre, long valor, Date fechaExpiracion, String sujetoActivo, String tipoImpuesto) {
        this.nombre = nombre;
        this.valor = valor;
        this.fechaExpiracion = fechaExpiracion;
        this.sujetoActivo = sujetoActivo;
        this.tipoImpuesto = tipoImpuesto;
    }

    public Impuesto(String nombre, int i, Date venP, String predial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getSujetoActivo() {
        return sujetoActivo;
    }

    public void setSujetoActivo(String sujetoActivo) {
        this.sujetoActivo = sujetoActivo;
    }


    public String getTipoImpuesto() {
        return tipoImpuesto;
    }

    public void setTipoImpuesto(String tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }

    public void setValor(double tarifaF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

            
            
}
    
