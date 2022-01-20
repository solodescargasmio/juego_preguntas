/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clase.Estadistica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yo
 */
public class ControladorEstadistica {
   public int guardar_estadistica(Connection cnn,Estadistica est){
        int Id=0;
        try {
            PreparedStatement query;
            query=cnn.prepareStatement("INSERT INTO estadistica (idJugador,idRonda,Premio) VALUES (?,?,?)");
            query.setInt(1, est.getIdJugador());
            query.setInt(2, est.getIdRonda());
            query.setInt(3, est.getPremio());
            query.executeUpdate();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,ex);
                }
        return Id;
    }
    public Estadistica getEstadistica(Connection cnn,int nJug) throws SQLException{
        Estadistica est=null;
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM estadistica WHERE idJugador= ?");
            query.setInt(1,nJug);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                est=new Estadistica();
                est.setId(resultado.getInt("id"));
                est.setIdJugador(resultado.getInt("idJugador"));
                est.setIdRonda(resultado.getInt("idRonda"));
                est.setPremio(resultado.getInt("Premio"));
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
        
        return est;
    } 
    public ArrayList<Estadistica> getAllEstadistica(Connection cnn) throws SQLException{
        ArrayList<Estadistica> estadisticas=new ArrayList<Estadistica>();
        
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("select e.*, j.Nick as Nick,j.Tipo_Premio as Tipo_Premio from estadistica e " +
                                            " inner join jugador j on j.id=e.idJugador");
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Estadistica est=null;
                est=new Estadistica();
                est.setId(resultado.getInt("id"));
                est.setIdJugador(resultado.getInt("idJugador"));
                est.setIdRonda(resultado.getInt("idRonda"));
                est.setPremio(resultado.getInt("Premio"));
                est.setJugador(resultado.getString("Nick"));
                est.setTipo_P(resultado.getInt("Tipo_Premio"));
                estadisticas.add(est);
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
        
        return estadisticas;
    } 
}
