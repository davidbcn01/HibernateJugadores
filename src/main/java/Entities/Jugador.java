package Entities;

import java.io.Serializable;

public class Jugador extends Persona implements Serializable {
    int idCarta,idEquipo,idJugador;

    public Jugador(int idCarta, int idEquipo, int idJugador) {
        this.idCarta = idCarta;
        this.idEquipo = idEquipo;
        this.idJugador = idJugador;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idCarta=" + idCarta +
                ", idEquipo=" + idEquipo +
                ", idJugador=" + idJugador +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
