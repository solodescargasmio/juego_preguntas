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
public class Opcion {
    private int id;
    private int idPregunta;
    private String sRespuesta;
    private boolean bCorrecta;

    public Opcion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getsRespuesta() {
        return sRespuesta;
    }

    public void setsRespuesta(String sRespuesta) {
        this.sRespuesta = sRespuesta;
    }

    public boolean isbCorrecta() {
        return bCorrecta;
    }

    public void setbCorrecta(boolean bCorrecta) {
        this.bCorrecta = bCorrecta;
    }
    
}
