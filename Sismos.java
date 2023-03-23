
import java.util.Scanner;

public class Sismos {

    public static void main(String[] args) {
        double sismos[][] = new double[7][10];
        menu(sismos);
    }

    public static void sismoMayor(double[][] sismos) {
        double nMayor = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (sismos[i][j] > nMayor) {
                    nMayor = sismos[i][j];
                }
            }
        }
    }

    public static void agregarSismos(double sismos[][]) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                sismos[i][j] = sisgGen();
            }
        }
    }

    public static int totalVinilos(String m[][]) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (m[i][0] == null) {
                break;
            }
            count++;
        }
        return count;
    }

    public static double sisgGen() {
        double num = Math.random() * 10;
        return num;

    }

    public static void menu(double[][] sismos) {
        System.out.println("Menu");
        System.out.println("Que desea realizar?");
        opcion(sismos);

    }

    private static void opcion(double[][] sismos) {
        Scanner screen = new Scanner(System.in);
        int opcion = screen.nextInt();
        switch (opcion) {
            case 1:
                agregarSismos(sismos);
                menu(sismos);
            case 2:

                menu(sismos);
            case 3:

                menu(sismos);
            case 4:

                menu(sismos);
            case 5:
                System.out.println("Hasta la proxima");
                break;
        }
    }
}
