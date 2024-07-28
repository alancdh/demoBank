package com.example.DemoBank;

import java.util.Random;

public class generaRandom {

    public static String FirstNameRandom (){
        int longitud = 10;
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String LastNameRandom (){
        int longitud = 10;
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String AdressRandom (){
        int longitud = 14;
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String CityRandom (){
        int longitud = 8;
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String StateRandom (){
        int longitud = 8;
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String zipCodeRandom (){
        int longitud = 5;
        String caracteres = "1234567890";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String PhoneRandom (){
        int longitud = 8;
        String caracteres = "1234567890";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String SnnRandom (){
        int longitud = 8;
        String caracteres = "1234567890";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String UsernameRandom (){
        int longitud = 8;
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

    public static String PasswordRandom (){
        int longitud = 8;
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            cadenaAleatoria.append(caracteres.charAt(indiceAleatorio));
        }
        return cadenaAleatoria.toString();
    }

}
