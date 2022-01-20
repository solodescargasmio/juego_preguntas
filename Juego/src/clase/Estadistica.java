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
public class Estadistica {
    private int id;
    private int idJugador;
    private int idRonda;
    private int Premio;
    private String Jugador;
    private int Tipo_P;

    public Estadistica() {
    }

    public int getTipo_P() {
        return Tipo_P;
    }

    public void setTipo_P(int Tipo_P) {
        this.Tipo_P = Tipo_P;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }

    public int getPremio() {
        return Premio;
    }

    public void setPremio(int Premio) {
        this.Premio = Premio;
    }
    
    public String getJugador() {
        return Jugador;
    }

    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }
    
    
}
