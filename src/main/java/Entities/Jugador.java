package Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name="jugador")
@DiscriminatorValue("JUGADOR_INFO")
public class Jugador extends Persona implements Serializable {
    int idEquipo;
    @Id
    @Column(name = "idJugador")
    int idJugador;
    @OneToOne(mappedBy = "jugador", fetch = FetchType.LAZY)
    Estadisticas estadisticas;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcarta")
    private Carta carta;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idequipo")
    private Equipo equipo;

    /*public Jugador(Carta carta, int idEquipo, int idJugador) {
        this.carta= carta;
        this.idEquipo = idEquipo;
        this.idJugador = idJugador;
    }

     */

    public Jugador() {
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

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idEquipo=" + idEquipo +
                ", idJugador=" + idJugador +
                ", estadisticas=" + estadisticas +
                ", carta=" + carta +
                ", equipo=" + equipo +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
