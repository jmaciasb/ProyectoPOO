/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

public class Ciudadano {
    
    private String nombre;
    private int edad;
    private int NumeroIdentificacion;
    private String Password;
    private double avaluo;
    private String genero;
    private String estrato;
    private String direccion;
    private String departamento;
    private double ingresos;
    private double deudas;
    private String municipio;
    private long telefono;
    private String correo;
    private ArrayList<Multa> multalList; 
    private ArrayList<Impuesto> impuestos;
    //private HistorialImpuestos historial;
    //private Usuario usuario;

    public Ciudadano(String nombre, int edad, int NumeroIdentificacion, String genero, String estrato, String direccion, String departamento,double avaluo, double ingresos, double deudas, String municipio, long telefono, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.NumeroIdentificacion = NumeroIdentificacion;
        this.genero = genero;
        this.estrato = estrato;
        this.direccion = direccion;
        this.departamento = departamento;
        this.ingresos = ingresos;
        this.deudas = deudas;
        this.municipio = municipio;
        this.telefono = telefono;
        this.correo = correo;
        //this.multalList = multalList;
        //this.impuestos = impuestos;
        //this.historial = historial;
        //this.usuario = usuario;
    }
    
       
    public Ciudadano() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public  int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(int NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }
    
    public  String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getDeudas() {
        return deudas;
    }

    public void setDeudas(double deudas) {
        this.deudas = deudas;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(double avaluo) {
        this.avaluo= avaluo;
    }
    
    public ArrayList<Impuesto> getImpuestos() {
        return impuestos;
    }
    
    public void setImpuestos(ArrayList<Impuesto> impuestos) {
        this.impuestos = impuestos;
    }

    /*{public ArrayList<Multa> getMultalList() {
        return multalList;
    }

    public void setMultalList(ArrayList<Multa> multalList) {
        this.multalList = multalList;
    }

    

    public void setImpuestos(ArrayList<Impuesto> impuestos) {
        this.impuestos = impuestos;
    }

    public HistorialImpuestos getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialImpuestos historial) {
        this.historial = historial;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }*/
    
    
     
     
    
    
    
    


    
            
            
            
            
            
            
            
            
            
}
