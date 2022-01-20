/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
public class ControladorOpcion {
   public int guardar_pregunta(Connection cnn,Opcion o){
        int Id=0;
        try {
            PreparedStatement query;
            query=cnn.prepareStatement("INSERT INTO opcion (idPregunta,Respuesta,Correcta) VALUES (?,?,?)");
            query.setInt(1, o.getIdPregunta());
            query.setString(2, o.getsRespuesta());
            query.setBoolean(3, o.isbCorrecta());
            query.executeUpdate();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,ex);
                }
        return Id;
    }
    public Opcion getOpcion(Connection cnn,int nOp) throws SQLException{
        Opcion opcion=null;
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM opcion WHERE id= ?");
            query.setInt(1,nOp);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                opcion=new Opcion();
                opcion.setId(nOp);
                opcion.setIdPregunta(resultado.getInt("idPregunta"));
                opcion.setbCorrecta(resultado.getBoolean("Correcta"));
                opcion.setsRespuesta(resultado.getString("Respuesta"));
                
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
        
        return opcion;
    } 
    public ArrayList<Opcion> getAll(Connection cnn) throws SQLException{
    ArrayList<Opcion> opciones = new ArrayList<Opcion>();
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM opcion");
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Opcion opcion=new Opcion();
                opcion.setId(resultado.getInt("id"));
                opcion.setIdPregunta(resultado.getInt("idPregunta"));
                opcion.setbCorrecta(resultado.getBoolean("Correcta"));
                opcion.setsRespuesta(resultado.getString("Respuesta"));
                opciones.add(opcion);
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
    return opciones;
    } 
    
    public ArrayList<Opcion> getAllPregunta(Connection cnn, int nPre) throws SQLException{
    ArrayList<Opcion> opciones = new ArrayList<Opcion>();
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM opcion WHERE idPregunta=?");
            query.setInt(1, nPre);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Opcion opcion=new Opcion();
                opcion.setId(resultado.getInt("id"));
                opcion.setIdPregunta(resultado.getInt("idPregunta"));
                opcion.setbCorrecta(resultado.getBoolean("Correcta"));
                opcion.setsRespuesta(resultado.getString("Respuesta"));
                opciones.add(opcion);
            }
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    return opciones;
    }
}
