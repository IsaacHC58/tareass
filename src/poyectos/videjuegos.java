package poyectos;

import java.util.HashMap;
import java.util.Map;

public class videjuegos {
	private String nombre;
    private Map<String, campeon> campeones;

    
    public videjuegos(String nombre) {
        this.nombre = nombre;
        this.campeones = new HashMap<>();
    }


    public void agregarCampeon(campeon campeon) {
        campeones.put(campeon.getNombre(), campeon);
    }

    public campeon obtenerCampeon(String nombre) {
        return campeones.get(nombre);
    }

    public Map<String, campeon> obtenerTodosLosCampeones() {
        return campeones;
    }

    @Override
    public String toString() {
        return "Videojuego{nombre='" + nombre + "', campeones=" + campeones + "}";
    }

}
