
package com.mycompany.proyectoquickpass;

import java.io.FileWriter;
import java.io.IOException;


public class ArchivoTXT {

    public static void main(String[] args) {
        try (FileWriter fichero = new FileWriter("C:\\Users\\josee\\OneDrive\\Desktop\\Programacion\\Clase.txt")) {
            fichero.write("Grupo 3/Viernes 6pm-9pm\n");
            fichero.write("Jose Elias Cardinale Velasquez\n");
            fichero.write("Ashley Chavarria Calderon\n");
            fichero.write("Mario Aguilar Lopez\n");
            fichero.write("Justin Rodríguez Caparroso\n");
            
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}

