package stomas.andresygerald.ejercicio02;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int[][] datos = new int[4][10];
        int[] suma = new int[4];
        Random r = new Random();
        for (int i = 0; i < 4;i++){
            suma[i] = 0;
            for(int j = 0; j < 10; j++){
                datos[i][j] = r.nextInt(140, 210);
                suma[i] += datos[i][j];
            }
        }
        int[] med = new int[4];
        int[] min = new int[4];
        int[] max = new int[4];

        for (int i = 0; i < 4;i++){
            med[i] = ((int) suma[i] / datos[i].length);
            for(int j = 0; j < 10; j++) {
                if (j == 0) {
                    max[i] = datos[i][j];
                    min[i] = datos[i][j];
                } else {
                    max[i] = Math.max(datos[i][j], max[i]);
                    min[i] = Math.min(datos[i][j], min[i]);
                }
            }
        }
        System.out.println("                                                | MED | MIN | MAX |");
        for (int i = 0; i < 4;i++){
            System.out.print(paises[i]+" ");
            for(int j = 0; j < 10; j++){
                System.out.print(datos[i][j]+" ");
            }
            System.out.println(" | "+med[i]+" | "+min[i]+" | "+max[i]+" |");
        }

    }
}
