/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import formulario.Principal;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yo
 */
public class Conectar {
    private Connection cnn = null;
   public final Connection obtener() throws SQLException, ClassNotFoundException {
       String sJdbc="";
       String sRoot="";
       String sPass="";
       try {
            // TODO add your handling code here:
            
            File doc =
                    new File("C:\\Juego.ini");
            Scanner obj = new Scanner(doc);
            int nCont=0;
            while (obj.hasNextLine()){
              /*  if(nCont==0){sJdbc = obj.nextLine();
                }else if(nCont==1){
                    sRoot = obj.nextLine();
                }else{
                    obj.nextLine();}*/
                switch(nCont){
                    case 0: sJdbc = obj.nextLine();  break;
                    case 1: sRoot = obj.nextLine(); break;
                    case 2: sPass = obj.nextLine(); break;
                }nCont=nCont+1;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
      if (cnn == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(sJdbc,sRoot, sPass);
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return cnn;
   }
}
