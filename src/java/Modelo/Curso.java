/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Curso {
    private int idcurso;
    private String nombre;
    private String horas;
    private String creditos;
    private String estado;

    public Curso() {
    }

    public Curso(int idcurso, String nombre, String horas,String creditos, String estado) {
        this.idcurso = idcurso;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso= idcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public String gethoras() {
        return horas;
    }

    public void sethoras(String horas) {
        this.horas = horas;
    }

    public String getcreditos() {
        return creditos;
    }

    public void setCodigo(String creditos) {
        this.creditos = creditos;
    }

    public void setcreditos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}

