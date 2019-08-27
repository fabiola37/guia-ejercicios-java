package ar.edu.unahur.obj2.ejercicio1;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] tempDelDia = new double[23];
        double suma = 0, max = 99, min = -99, media = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < tempDelDia.length; i++) {
            System.out.println("Ingrese la temperatura: ");
            double t = entrada.nextDouble();
            suma += t;
            tempDelDia[i] = t;

            if ( t >max){
                max = t;
            }
            if (  t < min){
                min = t;
            }
        }
        for (int i = 0; i < tempDelDia.length; i++) {
            if (tempDelDia[i] == min) {
                System.out.println(i + "#######" + tempDelDia[i] + "--> min");
            } else if (tempDelDia[i] == max) {
                System.out.println(i + "#######" + tempDelDia[i] + "--> max");
            } else {
                System.out.println(i + "#######" + tempDelDia[i]);
            }
        }
        media = suma / 24;
        System.out.println("La media es:" + media);
    }
}















