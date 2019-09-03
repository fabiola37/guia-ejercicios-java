package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        int nAlumnos = 0;
        String letra = "a";

        Scanner ingresoCantidad = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos: ");
         nAlumnos = ingresoCantidad.nextInt();

        String[] alumnos = new String[nAlumnos];//arreglo


        for (int i = 0; i < nAlumnos; i++) {
            Scanner entradaNombre = new Scanner(System.in);
            System.out.println("Ingrese el nombre y apellido: ");
            alumnos[i] = entradaNombre.next();
        }
        while(!letra.equals("Fin")){//para que el programa finalice con FIN
            Scanner entradaLetra = new Scanner(System.in);
            System.out.println("Ingrese una letra: ");
            letra = entradaLetra.next();

            for(String nombre : alumnos){//me muestra la primera letra del
                                        // arreglo que yo elija
                if(nombre.charAt(0) == letra.charAt(0)){
                    System.out.println(nombre);
                }
            }

        }
    }
}

