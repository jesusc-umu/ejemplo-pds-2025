package umu.pds.modelo;

import java.time.LocalDate;

public class Inscripcion {

    private final LocalDate fecha;
    private final Jugador jugador;
    private final Actividad actividad;

    public Inscripcion(LocalDate fecha, Jugador jugador, Actividad actividad) {
        this.fecha = fecha;
        this.jugador = jugador;
        this.actividad = actividad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Actividad getActividad() {
        return actividad;
    }

}
