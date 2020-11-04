/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;
import java.util.Scanner;
/**
 *
 * @author Nixon
 */
public class Ejemplo04 {
    public static void main (String[]args){
    Scanner teclado = new Scanner(System.in);
        String nombre, apellido, ciudad, pais;
        int nacimiento;
        System.out.println("Ingrese sus nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellido = teclado.nextLine();
        System.out.println("Ingrese la ciudad en la que se encuentra Sr."
                +nombre+" "+apellido);
        ciudad = teclado.nextLine();
        System.out.println("Ingrese el pais en el que se encuentra Sr."
                +nombre+" "+apellido);
        pais = teclado.nextLine();
        System.out.println("Ingrese el año de su nacimiento");
        nacimiento = teclado.nextInt();
        System.out.printf("Datos del estudiante:\n%s\n%s\n%s\n%s\n%d\n", 
                nombre, apellido, ciudad, pais,nacimiento);
    }
}