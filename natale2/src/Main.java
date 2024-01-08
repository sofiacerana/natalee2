import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inizializzo l'array con 10 numeri tra graffe
        int[] a = {6, 10, 4, -1, 8, 14, -7, 5, 11, 1};

        // Calcolo la somma
        int somma = calcoloSomma(a);

        // Calcolo la media
        double media = calcoloMedia(a);

        // Trovo il max e il min
        int max = trovaMax(a);
        int min = trovaMin(a);

        // Stampo
        System.out.println("Somma: " + somma);
        System.out.println("Media: " + media);
        System.out.println("Numero massimo: " + max);
        System.out.println("Numero minimo: " + min);
    }

    // Calcolo la somma
    public static int calcoloSomma(int[] a) {
        int somma = 0;
        for (int num : a) {
            somma += num;
        }
        return somma;
    }

    // Calcolo la media
    public static float calcoloMedia(int[] a) {
        int somma = calcoloSomma(a);
        float media =  somma / a.length;
        return media;
    }

    // Calcolo il max
    public static int trovaMax(int[] a) {
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Calcolo il min
    public static int trovaMin(int[] a) {
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
