package com.example;

public class Main {
    public static void main(String[] args) {
        menu();
        ejecutarOpcion();

    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Verificar si una frase es un palíndromo");
        System.out.println("2. Contar vocales en una frase");
        System.out.println("3. encriptar una frase");
        System.out.println("4. desencriptar una frase");
        System.out.println("5. Salir");
        
    }
    public static int pedirOpcion(){
        System.out.println("Ingrese una opción:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }
    public static void ejecutarOpcion(int opcion){
        switch (opcion) {
            case 1: 
                pedirFrase();
                palindromo(frase);
                break;

            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static void pedirFrase(){
        System.out.println("Ingrese una frase:");
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
    }

    public static void palindromo(String frase){
        String fraseLimpia = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String fraseInvertida = new StringBuilder(fraseLimpia).reverse().toString();
        if (fraseLimpia.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }




}