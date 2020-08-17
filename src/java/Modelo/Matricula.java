/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Matricula {
    private int idmatricula;
    private int idestudiante;
    private String semestre;
    private String ciclo;
    private String estado;
   private  int idcurso;
     private int idcarrera;
 
    public  Matricula() {
    }

    public Matricula(int idmatricula, int idestudiante,String semestre, String ciclo ,int idcurso,int idcarrera, String estado) {
        this.idmatricula = idmatricula; 
        this.idestudiante = idestudiante;
        this.semestre = semestre;
        this.ciclo = ciclo;
        this.idcurso = idcurso;
        this.estado = estado;
        this.idcarrera = idcarrera;
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo =ciclo;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso= idcurso;
    }
   public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante= idestudiante;
    }
      public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera= idcarrera;
    }
    
    
    
}


