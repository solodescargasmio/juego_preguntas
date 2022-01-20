/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clase.Jugador;
import clase.Opcion;
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
public class ControladorJugador {
    public int guardar_jugador(Connection cnn,Jugador j){
        int Id=0;
        try {
            PreparedStatement query;
            query=cnn.prepareStatement("INSERT INTO jugador (Nick,Tipo_Premio) VALUES (?,?)");
            query.setString(1, j.getsNick());
            query.setInt(2, j.getTipo_Premio());
            query.executeUpdate();
            Id = obtenerUltimoJugador(cnn);
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,ex);
                }
        return Id;
    }
    public Jugador getJugador(Connection cnn,String sNick) throws SQLException{
        Jugador jug=null;
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM jugador WHERE Nick= ?");
            query.setString(1, sNick);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                jug=new Jugador();
                jug.setId(resultado.getInt("id"));
                jug.setsNick(resultado.getString("Nick"));
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
        
        return jug;
    }
    public int obtenerUltimoJugador(Connection cnn) throws SQLException{
    int id=0;
    PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT MAX(id) as id FROM jugador");
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                id=resultado.getInt("id");
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
    return id;
    }
    
    public ArrayList<Jugador> getAll(Connection cnn) throws SQLException{
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM jugador");
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Jugador jug=new Jugador();
                jug.setId(resultado.getInt("id"));
                jug.setsNick(resultado.getString("Nick"));
                jug.setTipo_Premio(resultado.getInt("Tipo_Premio"));
                jugadores.add(jug);
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
    return jugadores;
    } 
}
