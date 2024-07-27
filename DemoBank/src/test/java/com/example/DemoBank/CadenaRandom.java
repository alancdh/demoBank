package com.example.DemoBank;
import java.util.Random;

public class CadenaRandom {
    private static final String Letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int Longitud = 8;

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder creadorCadena = new StringBuilder(Longitud);

        for (int i = 0; i < Longitud; i++) {
            int contador = random.nextInt(Letras.length());
            creadorCadena.append(Letras.charAt(contador));
        }

        String randomString = creadorCadena.toString();
        System.out.println("Cadena Random: " + randomString);
    }
}