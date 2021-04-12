package Entities;

import java.io.Serializable;
import java.sql.Date;

public class Carta implements Serializable {

    String nombreTipo;
    Date fechaLanzamiento;
    int idCarta;

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nombreTipo='" + nombreTipo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", idCarta=" + idCarta +
                '}';
    }
}
