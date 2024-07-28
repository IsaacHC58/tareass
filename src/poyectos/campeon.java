package poyectos;

import java.util.List;

public class campeon {
	private String nombre;
    private String rol;
    private boolean ganador;
    private List<String> habilidades;

    // Constructor
    public void Campeon(String nombre, String rol, boolean ganador, List<String> habilidades) {
        this.nombre = nombre;
        this.rol = rol;
        this.ganador = ganador;
        this.habilidades = habilidades;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Campeon{nombre='" + nombre + "', rol='" + rol + "', ganador=" + ganador + ", habilidades=" + habilidades + "}";
    }

}
