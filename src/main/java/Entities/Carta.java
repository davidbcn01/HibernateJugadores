package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table( name="carta")
public class Carta implements Serializable {
@Column(name ="nombreTipo")
    String nombreTipo;
@Column(name = "fechaLanzamiento")
    Date fechaLanzamiento;
@Id
@Column(name = "idCarta")
int idCarta;
@OneToMany(mappedBy = "carta")
private List<Jugador> jugadorList;

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
                ", jugadorList=" + jugadorList +
                '}';
    }
}
