package pl.devopsi.akademia;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {


        int val_integer = 250;
        String val_string = "Akademia jest super !";
        double val_double = 1.234555;

        System.out.println("Zmienna val_integer ma wartość " + val_integer);
        System.out.println("Zmienna val_string ma wartość " + '"'+val_string+'"');
        System.out.println("Zmienna val_double ma wartość " + val_double);

        System.out.println("-------------------------------------------------------------------");
//-------------------------------------------------------------------------------------
/*
 dla a<20 czyli iteracja tabeli od pozycji 0 do 19 po sprawdzeniu wartsoci na pozycjach od 0 do 9 wyjdzie błąd ponieważtablica ma tylko 10 pozycji
 prawidłowo przy takiej tablicy musi być a<10 bądź a<=9
*/
        int[] tab = {1,2,3,4,5,6,7,8,9,10,};

        for (int a=0; a<10; a++){
            if (tab[a]%2==0) {
                System.out.println("Liczba " + tab[a] + " jest parzysta");
                continue;
            }
            System.out.println(tab[a]);
        }
        System.out.println("-------------------------------------------------------------------");


// Ale można zrobić j/n :) za pomocą własciwosci tabeli length

        for (int a = 0; a < tab.length; a++){
            if (tab[a]%2==0) {
                System.out.println("Liczba " + tab[a] + " jest parzysta");
                continue;
            }
            System.out.println(tab[a]);
        }
        System.out.println("-------------------------------------------------------------------");



//-------------------------------------------------------------------------------------
        boolean a = true;
        int b = 0;
        int sum = 0;
        while (a) {
            sum = sum + b++;
            if (b == 501){
                a = false;
                System.out.println("Suma liczb od 1 do 500 równa się " + sum);
            }
        }
        System.out.println("-------------------------------------------------------------------");

//-------------------------------------------------------------------------------------
/*Na początku chciałem stworzyć osobno if a pózniej dopiero switch ale nie chcialo mi pobrac zmiennej do instrukcji switch.
Moze cos w stylu lokalnej i globalnej zmiennej??
*/
        char valueA = 'A';
        char valueB = 'B';
        char valueC = 'C';

        int[] tab2 = {2,4,5,3};
        int sum2 = 0;
        for (int c = 0; c < tab2.length; c++) {
            sum2 = sum2 + tab2[c];
        }
        int avr = sum2 / tab2.length;
//        System.out.println(avr);

        if (avr >= 4) {
            System.out.println(valueA);
            switch ('A') {
                case 'A':
                System.out.println("Super");
                break;
                default:
                    System.out.println("coś nie tak...");
            }
        }
        else if (avr >= 3 && avr <4){
            System.out.println(valueB);
            switch ('B') {
                case 'B':
                System.out.println("Srednio");
                break;
                default:
                    System.out.println("coś nie tak...");
            }
        }
        else if (avr < 3){
            System.out.println(valueC);
            switch ('C') {
                case 'C':
                System.out.println("Slabo");
                break;
                default:
                    System.out.println("coś nie tak...");
            }
        }

        System.out.println("-------------------------------------------------------------------");
//-------------------------------------------------------------------------------------
// Nie jestem do końca pewien czy o taki sposób Ci chodziło ale na chilę obecna tak mi się udało :)


        double[] val = {1.3,-2.78,3.34,-4.99};
        double[] modVal = new double[val.length];

        for (int i = 0; i < val.length; i++){
            double f = abs(val[i]);
            modVal[i] = f;

        }
        System.out.println(Arrays.toString(modVal));

        System.out.println("-------------------------------------------------------------------");
//-------------------------------------------------------------------------------------

// Na potrzeby pracy domowej zakladam ze imie damskie konczy sie na "a".

        Type[] enums = {Type.MAN,Type.WOMEN};
        System.out.println("Podaj imię: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.endsWith("a")){
            System.out.println(Type.WOMEN);
        }
        else{
            System.out.println(Type.MAN);
        }

    }
}
