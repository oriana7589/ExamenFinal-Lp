/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.bd.ConectaBd;
import Interfaces.CRUDMatricula;
import Modelo.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ori
 */
public class MatriculaDAO implements CRUDMatricula{
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Matricula m = new Matricula();

    @Override
    public List listarmatricula() {
         ArrayList<Matricula> matriculas = new ArrayList<>();
        String consulta = " Select idmatricula,e.nombre,semestre ,ciclo,cu.nombre,c.nombre,m.estado from estudiante e,curso cu, carrera c WHERE e.idestudiante=m.idestudiante and  cu.idcurso=m.idcurso and  c.idcarrera=m.idcarrera order by idmatricula";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Matricula matricula = new Matricula();
                matricula.setIdmatricula(rs.getInt("idmatricula"));
                matricula.setSemestre(rs.getString("semestre"));
                matricula.setCiclo(rs.getString("ciclo"));
                matricula.setEstado(rs.getString("estado"));
                matricula.setIdcurso(rs.getString("idcurso"));
                matricula.setIdestudiante(rs.getString("idestudiante"));
                matricula.setIdcarrera(rs.getString("idcarrera"));
                matriculas.add(matricula);
            }
        } catch (Exception m) {
            
        }
        return matriculas;
    }

    @Override
    public Matricula buscarmatricula(int idmatricula) {
        String consulta = " select *  "
                        + " from matricula  "
                        + " where idmatricula= " + idmatricula + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
               m.setIdmatricula(rs.getInt("idmatricula"));
                m.setSemestre(rs.getString("semestre"));
                m.setCiclo(rs.getString("ciclo"));
                m.setEstado(rs.getString("estado"));
                m.setIdcurso(rs.getString("idcurso"));
                m.setIdestudiante(rs.getString("idestudiante"));
                m.setIdcarrera(rs.getString("idcarrera"));
            }
        } catch (Exception m) {
        }
        
        return m;
    }

    @Override
    public boolean agregarmatricula(Matricula matricula) {
        String consulta = " insert into matricula(semestre, ciclo,idcurso,idestudiante, idcarrera,estado)  "
                        + " values( "
                        + "'"+ matricula.getSemestre() +"', "
                        + "'"+ matricula.getCiclo() +"', "
                        + "'"+ matricula.getIdcurso() +"', "
                        + "'"+ matricula.getIdestudiante() +"', "
                        + "'"+ matricula.getIdcarrera() +"', " 
                         + "'"+ matricula.getEstado() +"') ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception m) {
        }
        return false;
    }

    @Override
    public boolean editarmatricula(Matricula matricula) {
        String consulta = " update matricula"
                        + " set "
                        + " semestre = '"+ matricula.getSemestre() +"', "
                        + " ciclo= '"+ matricula.getCiclo() +"', "
                        + " idcurso= '"+ matricula.getIdcurso() +"', "
                        + " idestudiante= '"+ matricula.getIdestudiante() +"', "
                        + " idcarrera= '"+ matricula.getIdcarrera() +"', "
                        + " estado = '"+ matricula.getEstado() +"' "
                        + " where "
                        + " idmatricula = " + matricula.getIdmatricula() + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception m) {
        }
        return false;
    }

    @Override
    public boolean eliminarmatricula(int idmatricula) {
        String consulta = " delete from matricula"
                        + " where "
                        + " idmatricula = " + idmatricula + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception m) {
        }
        return false;
    }

}