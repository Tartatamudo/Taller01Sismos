import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    }

    public static double[][] IngresarDatos(){
        double Sismos[][] = new double[24][7];
        for (int i = 0; i < Sismos.length ; i++) {
            for (int j = 0; j < Sismos[i].length; j++) {
                Sismos[i][j] = (Math.random()*9.9);
            }
        }
        return Sismos;
    }

    public static void menu(){

    }

    public static double BuscarSismoMayor(double Sismos[][]){
        double max = 0.0;
        int posI = 0;
        int posJ = 0;
        for (int i = 0; i < Sismos.length ; i++) {
            for (int j = 0; j < Sismos[i].length; j++) {
                if (Sismos[i][j] > max){
                    max = Sismos[i][j];
                    posI = i;
                    posJ = j;
                }
            }
        }
        return max;
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

    public static void SismosSmsMayorOIguala7(){
    }

}
