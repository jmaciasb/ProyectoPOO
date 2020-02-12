/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;


public class Multa {
    
    private Date fechaDeCreacion;
    private Date FechaAumento;
    private double valor;       

    public Multa(Date fechaDeCreacion, Date FechaAumento, double valor) {
        this.fechaDeCreacion = fechaDeCreacion;
        this.FechaAumento = FechaAumento;
        this.valor = valor;
    }

    public Multa() {
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Date getFechaAumento() {
        return FechaAumento;
    }

    public void setFechaAumento(Date FechaAumento) {
        this.FechaAumento = FechaAumento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
            
    public void generarMulta(){
        
    }
}
