/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clase.Pregunta;
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
public class ControladorPregunta {
      public int guardar_pregunta(Connection cnn,Pregunta p){
        int Id=0;
        try {
            PreparedStatement query;
            query=cnn.prepareStatement("INSERT INTO pregunta (idCategoria,Pregunta) VALUES (?,?,?)");
            query.setInt(1, p.getIdCategoria());
            query.setString(3, p.getsPregunta());
            query.executeUpdate();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,ex);
                }
        return Id;
    }
      
    public Pregunta getPregunta(Connection cnn,int nPre, int nCat) throws SQLException{
        Pregunta pregunta=null;
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM pregunta WHERE id= ? and idCategoria= ?");
            query.setInt(1,nPre);
            query.setInt(2,nCat);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                pregunta=new Pregunta();
                pregunta.setId(nPre);
                pregunta.setIdCategoria(resultado.getInt("idCategoria"));
                pregunta.setsPregunta(resultado.getString("Pregunta"));
                
            }
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        
        return pregunta;
    } 
    public ArrayList<Pregunta> getAll(Connection cnn) throws SQLException{
    ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM pregunta");
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Pregunta pregunta=new Pregunta();
                pregunta.setId(resultado.getInt("id"));
                pregunta.setIdCategoria(resultado.getInt("idCategoria"));
                pregunta.setsPregunta(resultado.getString("Pregunta"));
                preguntas.add(pregunta);
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
    return preguntas;
    } 
    
    public ArrayList<Pregunta> getPreguntasCategorias(Connection cnn, int  nCat) throws SQLException{
    ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM pregunta WHERE idCategoria=?");
            query.setInt(1,nCat);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Pregunta pregunta=new Pregunta();
                pregunta.setId(resultado.getInt("id"));
                pregunta.setIdCategoria(resultado.getInt("idCategoria"));
                pregunta.setsPregunta(resultado.getString("Pregunta"));
                preguntas.add(pregunta);
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
    return preguntas;
    }
}
