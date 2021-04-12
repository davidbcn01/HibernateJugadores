package Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name="jugador")
public class Jugador extends Persona implements Serializable {
    int idCarta,idEquipo;
    @Id
    @Column(name = "idJugador")
    int idJugador;
    @OneToOne(mappedBy = "jugador", fetch = FetchType.LAZY)
    Estadisticas estadisticas;


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
