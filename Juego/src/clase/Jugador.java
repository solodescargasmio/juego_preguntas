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
public class Jugador {
    private int id;
    private String sNick;
    private int Tipo_Premio;
    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsNick() {
        return sNick;
    }

    public void setsNick(String sNick) {
        this.sNick = sNick;
    }

    public int getTipo_Premio() {
        return Tipo_Premio;
    }

    public void setTipo_Premio(int Tipo_Premio) {
        this.Tipo_Premio = Tipo_Premio;
    }
    

}
