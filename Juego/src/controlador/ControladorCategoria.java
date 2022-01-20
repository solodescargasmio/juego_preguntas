/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clase.Categoria;
import java.awt.List;
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
public class ControladorCategoria {
     public int guardar_categoria(Connection cnn,Categoria c){
        int Id=0;
        try {
            PreparedStatement query;
            query=cnn.prepareStatement("INSERT INTO categoria (Tipo,Dificultad) VALUES (?,?)");
            query.setString(1, c.getsTipo());
            query.setInt(2, c.getnDificultad());
            query.executeUpdate();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,ex);
                }
        return Id;
    }
    public Categoria getCategoria(Connection cnn,int nCat) throws SQLException{
        Categoria cat=null;
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM categoria WHERE Dificultad= ?");
            query.setInt(1, nCat);
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                cat=new Categoria();
                cat.setId(resultado.getInt("id"));
                cat.setsTipo(resultado.getString("Tipo"));
                cat.setnDificultad(resultado.getInt("Dificultad"));
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
        
        return cat;
    } 
    public ArrayList<Categoria> getAll(Connection cnn) throws SQLException{
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        PreparedStatement query;
        try {
            query = cnn.prepareStatement("SELECT * FROM categoria");
            ResultSet resultado=query.executeQuery();
            while(resultado.next()){
                Categoria cat=new Categoria();
                cat.setId(resultado.getInt("id"));
                cat.setsTipo(resultado.getString("Tipo"));
                cat.setnDificultad(resultado.getInt("Dificultad"));
                categorias.add(cat);
            }
            
            } catch (SQLException ex) {
                throw new SQLException();
            }
    return categorias;
    }
}
