package umu.pds.modelo;

import java.time.LocalDate;

public class Jugador {

    private final String nombre;
    private final LocalDate fechaNacimiento;
    private final String email;

    public Jugador(String nombre, LocalDate fechaNacimiento, String email) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

}
