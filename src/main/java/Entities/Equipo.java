package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class Equipo implements Serializable {
    @Column(name = "nombre")
    String nombre;
    @Column(name = "liga")
    String liga;
    @Id
    @Column(name = "idEquipo")
    int idEquipo;

    public String getNombre() {
        return nombre;
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
                '}';
    }
}
