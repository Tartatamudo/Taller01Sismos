import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static double[][] IngresarDatos() {
        double Sismos[][] = new double[24][7];
        for (int i = 0; i < Sismos.length; i++) {
            for (int j = 0; j < Sismos[i].length; j++) {
                Sismos[i][j] = (Math.random() * 9.9);
            }
        }
        return Sismos;
    }

    public static double BuscarSismoMayor(double Sismos[][]) {
        double max = 0.0;
        int posI = 0;
        int posJ = 0;
        for (int i = 0; i < Sismos.length; i++) {
            for (int j = 0; j < Sismos[i].length; j++) {
                if (Sismos[i][j] > max) {
                    max = Sismos[i][j];
                    posI = i;
                    posJ = j;
                }
            }
        }
        return max;
    }

    public static void ImprimirSismoMAyor(double Sismos[][]) {
        double max = BuscarSismoMayor(Sismos);
        System.out.printf("El sismo mas grande es de: " + max);
    }

    public static int SismosMayoresA5(double Sismos[][]) {
        int acum = 0;
        for (int i = 0; i < Sismos.length; i++) {
            for (int j = 0; j < Sismos[i].length; j++) {
                if (Sismos[i][j] >= 5.0) {
                    acum = acum + 1;
                }
            }
        }
        return acum;
    }

    public static void imprimirNumSismosMayores5(double Sismos[][]) {
        int num = SismosMayoresA5(Sismos);
        System.out.printf("EL numero de sismos mayores o iguales a 5.0 son: " + num);
    }

    public static void SismosSmsMayorOIguala7(double Sismos[][]) {
        int acum = 0;
        for (int i = 0; i < Sismos.length; i++) {
            for (int j = 0; j < Sismos[i].length; j++) {
                if (Sismos[i][j] >= 7.0) {
                    acum = acum + 1;
                    System.out.println("Alerta!!! se debe evacuar zona costera!, Sismo de: " + Sismos[i][j]);
                }
            }
        }
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 1;

        double Sismos[][] = new double[24][7];

        while ((0 < eleccion) && (eleccion < 5)) {
            System.out.println();
            System.out.println("Eliga la opcion que quiere hacer:");
            System.out.println("[1]Ingresar datos");
            System.out.println("[2]Mostrar sismo de mayor magnitud");
            System.out.println("[3]Contar sismos mayores o iguales a 5.0");
            System.out.println("[4]Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("Si desea salir debe ingresar cualquier otro numero");
            eleccion = teclado.nextInt();
            switch (eleccion) {
                case 1:
                    Sismos = IngresarDatos();
                    break;
                case 2:
                    ImprimirSismoMAyor(Sismos);
                    break;
                case 3:
                    imprimirNumSismosMayores5(Sismos);
                    break;
                case 4:
                    SismosSmsMayorOIguala7(Sismos);
                    break;
                default:
                    System.out.println("Salio del programa exitosamente");
                    break;
            }
        }
    }
}
