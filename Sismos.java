
import java.util.Scanner;

public class Sismos {

    public static void main(String[] args) {
        double sismos[][] = new double[7][10];
        menu(sismos);
    }

    public static double sismoMayor(double[][] sismos) {
        double nMayor = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (sismos[i][j] > nMayor) {
                    nMayor = sismos[i][j];
                }
            }
        }
        return nMayor;
    }

    public static void agregarSismos(double sismos[][]) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                sismos[i][j] = sisgGen();
            }
        }
    }

    public static double sisgGen() {
        double num = Math.random() * 10;
        return num;

    }

    public static void menu(double[][] sismos) {
        System.out.println("Bienvenido al menú");
        System.out.println("Que desea realizar?");
        System.out.println("[1] Ingresar datos");
        System.out.println("[2] Mostrar sismo de mayor magnitud");
        System.out.println("[3] Contar sismos mayores o iguales a 5.0");
        System.out.println("[4] Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("[5] Salir");
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
                System.out.println("El sismo de mayor magnitud es de: " + sismoMayor(sismos) + " grados");
                menu(sismos);
            case 3:
                System.out.println("La cantidad de sismos mayores o iguales a 5.0 son: " + contarSis(sismos));
                menu(sismos);
            case 4:
                sms(sismos);
                menu(sismos);
            case 5:
                salir(sismos);
        }
    }

    public static int contarSis(double[][] sismos) {
        int count = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (sismos[i][j] >= 5.0) {
                    count++;
                } else {
                }
            }
        }
        return count;
    }

    public static void salir(double[][] sismos) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Seguro desea salir? (s/n)");
        String opcion = screen.next();
        if (opcion.equals("s")) {
            System.out.println("Hasta la proxima!");
            System.exit(0);
        } else if (opcion.equals("n")) {
            menu(sismos);
        }
    }

    public static void sms(double[][] sismos) {
        double sismo;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (sismos[i][j] >= 7.0) {
                    sismo = sismos[i][j];
                    System.out.println("SMS: se registro un sismo de: " + sismo + " grados, Cuidado!");
                }
            }
        }

    }
}
