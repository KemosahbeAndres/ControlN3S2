package stomas.andresygerald.ejercicio01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista = new int[10];
        int[] ordenada = new int[10];
        System.out.println("Ingresa 10 numeros.");
        for(int i = 0; i < 10; i++){
            lista[i] = sc.nextInt();
            //sc.nextLine();
        }
        int ei = 0;
        int oi=0;
        for(int i = 0; i < lista.length; i++){
            if(esPrimo(lista[i])){
                ordenada[ei] = lista[i];
                ei++;
            }
        }
        for(int i = 0; i < lista.length; i++){
            if(!esPrimo(lista[i])){
                ordenada[ei] = lista[i];
                ei++;
            }

        }
        System.out.println("Encontrados: ");
        for(int i = 0; i< lista.length; i++){
            System.out.print(i+", ");
        }
        System.out.println("");
        for(int n: lista){
            System.out.print(n+", ");
        }
        System.out.println("");
        System.out.println("Ordenada: ");
        for(int i = 0; i< lista.length; i++){
            System.out.print(i+", ");
        }
        System.out.println("");
        for(int n: ordenada){
            System.out.print(n+", ");
        }
    }
    public static boolean esPrimo(int n){
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59};
        boolean esprimo = false;
        for(int j = 0; j < primos.length; j++){
            if(n == primos[j]){
                esprimo = true;
            }
        }
        return esprimo;
    }
}
