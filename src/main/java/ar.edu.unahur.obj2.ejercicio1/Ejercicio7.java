package ar.edu.unahur.obj2.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int matriz[][];

        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese el numeros de filas: ");
        int nFilas = ingreso.nextInt();
        System.out.print("Ingrese el numeros de columnas: ");
        int nColumnas = ingreso.nextInt();

        matriz = new int[nFilas][nColumnas];

        for(int i=0;i< nFilas;i++) {//Este bloque llena la matriz por el usuario
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "] :");
                Random r = new Random();
                int aleatorio = r.nextInt(100);
                matriz[i][j] = ingreso.nextInt();
            }
        }
        System.out.print("\nLa matriz es: ");// Este bloque imprime la matriz
        for(int i=0;i< nFilas;i++) {
            for ( int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
