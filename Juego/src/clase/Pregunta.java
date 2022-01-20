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
public class Pregunta {
    private int id;
    private int idCategoria;
    private String sPregunta;

    public Pregunta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCategoria(int idCategoria){
        this.idCategoria=idCategoria;
    }
    
    public int getIdCategoria(){
        return idCategoria;
    }
    
    public String getsPregunta() {
        return sPregunta;
    }

    public void setsPregunta(String sPregunta) {
        this.sPregunta = sPregunta;
    }
    
}
