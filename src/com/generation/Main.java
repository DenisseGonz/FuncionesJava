package com.generation;
//import java.util.Scanner;


import java.util.Locale;

public class Main {
    public static void main(String[] args){
        /*
        String mensaje=saludar("Denisse González");
        System.out.println(mensaje);
        int resultado = suma(4,7);
        System.out.println(resultado);
        String mensaje2="Este es el mensaje impreso desde el método void";
        alerta(mensaje2);*/
        //Librería Math
        /*
        System.out.println(Math.PI);
        double num1=5456.34;
        double num2=34.56;
        System.out.println("Redondeando para arriba el número "+num1+": "+Math.ceil(num1));
        System.out.println("Redondeando para abajo el número "+num2+": "+Math.floor(num2));
        */
        String mensaje1="Hola, soy Denisse Gonzalez";
        String mensaje2="Adios!!";
        System.out.println(mensaje1.length());
        //en compareTo solo si los mensajes son iguales devuelve un cero
        System.out.println(mensaje1.compareTo(mensaje2));
        System.out.println(mensaje1.equals(mensaje2));
        //con equalsIgnoreCase devuelve un booleano sin importar si las letras son mayusculas o minusculas
        System.out.println(mensaje1.toUpperCase());
    }

    public static String saludar(String nombre){
        return "Hola, como estas "+nombre;
    }

    public static int  suma(int num1,int num2){
        return num1+num2;
    }

    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
//Clase 13 de octubre