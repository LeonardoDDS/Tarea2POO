
package Tarea2POO;

import java.util.Scanner;

/**
 * Nombre: Diaz Santos Leonardo Daniel
 * Tarea 2 de POO
 * Objetivo: Hacer un programa que capture una cadena que
 * tenga un nombre, profesión y nacionalidad.
 */
public class Tarea2 {
    public static void main(String[] args) {
        //Variables
        String nombre, nacionalidad, profesion;
        Scanner teclado = new Scanner(System.in);
        //Pedir el nombre
        System.out.println("Tu nombre es: ");
        nombre = teclado.nextLine();
        //Pedir la profesión
        System.out.println("Tu profesion es: ");
        nacionalidad = teclado.nextLine();
        //Pedir la nacionalidad
        System.out.println("Tu nacionalidad es: ");
        profesion = teclado.nextLine();
        //Mostramos el resultado
        System.out.println("\nNombre: " + nombre + "\nProfesion: " + profesion + 
                "\nNacionalidad: " + nacionalidad);
    }
}
