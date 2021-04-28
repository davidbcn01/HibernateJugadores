package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name="equipo")
public class Equipo implements Serializable {
    @Column(name = "nombre")
    String nombre;
    @Column(name = "liga")
    String liga;
    @Id
    @Column(name = "idEquipo")
    int idEquipo;
    @OneToMany(mappedBy = "equipo")
    private List<Jugador> jugadoresEquipo;
    public String getNombre() {
        return nombre;
    }

    public Equipo(String nombre, String liga, int idEquipo, List<Jugador> jugadoresEquipo) {
        this.nombre = nombre;
        this.liga = liga;
        this.idEquipo = idEquipo;
        this.jugadoresEquipo = jugadoresEquipo;
    }

    public Equipo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", liga='" + liga + '\'' +
                ", idEquipo=" + idEquipo +
                ", jugadoresEquipo=" + jugadoresEquipo +
                '}';
    }
}
