package paquete03;

import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal2 {

    public static void main(String[] args) {
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};
        
        // 1. guardar en la tabla autos de la base de datos
        Enlace a = new Enlace();
        
        for(int i = 0; i < autos.length; i++) {
            String matricula = autos[i][0];
            double valor = Double.parseDouble(autos[i][1]);
            
            Auto auto = new Auto();
            auto.establecerPlaca(matricula);
            auto.establecerValorMatricula(valor);
            
            a.insertarAuto(auto);
        }
        
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        for(int i = 0; i < a.obtenerDataAuto().size(); i++) {
            System.out.printf("%s",a.obtenerDataAuto().get(i));
        }
    }
    
}
