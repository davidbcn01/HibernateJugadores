package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table( name="jugador")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Persona implements Serializable {
    @Column(name = "nombre")
    String nombre;
    @Column(name = "apellidos")
    String apellidos;
    @Column(name = "nacionalidad")
    String nacionalidad;
    @Column(name = "fechanacimiento")
    Date fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
