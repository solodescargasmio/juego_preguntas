/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clase.Ronda;
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
public class ControladorRonda {

    public Ronda getRonda(Connection cnn,int nRon) throws SQLException{
        Ronda ronda=null;
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM ronda WHERE id= ?");
            query.setInt(1, nRon);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                ronda=new Ronda();
                ronda.setId(resultado.getInt("id"));
                ronda.setDificultad(resultado.getInt("Dificultad"));
                ronda.setIdPremio(resultado.getInt("idPremio"));
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
        
        return ronda;
    } 
    public ArrayList<Ronda> getAll(Connection cnn) throws SQLException{
    ArrayList<Ronda> rondas = new ArrayList<Ronda>();
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM ronda");
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Ronda ronda=new Ronda();
                ronda.setId(resultado.getInt("id"));
                ronda.setDificultad(resultado.getInt("Dificultad"));
                ronda.setIdPremio(resultado.getInt("Premio"));
                rondas.add(ronda);
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
    return rondas;
    }
}
