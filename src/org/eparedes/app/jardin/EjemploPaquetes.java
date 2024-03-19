package org.eparedes.app.jardin;

import org.eparedes.app.hogar.*;
import static org.eparedes.app.hogar.Persona.*;
import static org.eparedes.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Edwar");
        p.setApellido("Paredes");
        p.setColorPelo(RUBIO);
        System.out.println(p.getNombre());
        System.out.println(p.getColorPelo());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoHombre = GENERO_MASCULINO;
        String generoMujer = GENERO_FEMENINO;
    }
}
