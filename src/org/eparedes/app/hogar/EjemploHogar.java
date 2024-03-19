package org.eparedes.app.hogar;

import org.eparedes.app.jardin.Perro;
import static org.eparedes.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();

        String saludo = saludar();
    }
}
