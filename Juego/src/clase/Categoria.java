/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author yo
 */
public class Categoria {
    private int id;
    private String sTipo;
    private int nDificultad;

    public Categoria() {
    }
    
    public int getId(){
      return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getsTipo() {
        return sTipo;
    }

    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }

    public int getnDificultad() {
        return nDificultad;
    }

    public void setnDificultad(int nDificultad) {
        this.nDificultad = nDificultad;
    }
    
    
}
