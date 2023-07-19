/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Ciudad ciudad = new Ciudad("Cuenca", 100123);
        c.insertarCiudad(ciudad);
        c.establecerListaCiudad();
        
        for (int i = 0; i < c.obtenerListaCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerListaCiudad().get(i));
        }
    }
}
