/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import TDA.Cola;
import TDA.Lista;
import java.util.Date;
/**
 *
 * @author PC
 */
public class Expediente {
    private String id;
    private int nprioridad;
    private Usuario usuario;
    private String asunto;
    private String dReferencia;
    private Dependencia ndependencia;
    private String fyhInicio;
    private String fyhFin;
    private Cola<String> seguimiento;
      
    public Expediente(String id, int prioridad, Usuario usuario, String asunto, String dReferencia, Dependencia dependencia,String Date) {
        this.id = id;
        this.nprioridad = prioridad;
        this.usuario= usuario;
        this.asunto = asunto;
        this.ndependencia = dependencia;
        this.dReferencia = dReferencia;
        this.seguimiento=new Cola<>();
        this.fyhInicio=Date;
        this.fyhFin="En proceso";
    }

    public String getId() {
        return id;
    }

    public Cola<String> getSeguimiento() {
        return seguimiento;
    }
    
    public void insertarSeguimiento(String seguimiento){
        this.seguimiento.encolar(seguimiento);
    }
    
    public String getAsunto() {
        return asunto;
    }

    public String getdReferencia() {
        return dReferencia;
    }

    public String getFyhInicio() {
        return fyhInicio;
    }

    public String getFyhFin() {
        return fyhFin;
    }

    public void setFyhFin(String fyhFin) {
        this.fyhFin = fyhFin;
    }

    public String getNprioridad() {
        return "" + nprioridad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Dependencia getnDependencia() {
        return ndependencia;
    }

    public void setNdependencia(Dependencia ndependencia) {
        this.ndependencia = ndependencia;
    }
}
