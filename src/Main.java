import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        LF 6 / Programmierung II
        Array, Aufgabensammlung
        A04.01 Array Aufgabensammlung (4).pdf
        Aufgabe 8 "Würfelzähler"
        von M.W
        */



    int schleifencounter = 0;
    int x;
    int[] arraycounter = {0,0,0,0,0,0};


    while (schleifencounter<5000) {
        Random ran = new Random();
        x = 1 + ran.nextInt(6);
        schleifencounter++;

        if ( x == 1) { arraycounter[0]++;}
        else if(  x == 2 ) { arraycounter[1]++;}
        else if(  x == 3) { arraycounter[2]++;}
        else if( x == 4) { arraycounter[3]++;}
        else if(  x == 5) { arraycounter[4]++;}
        else if(  x == 6) { arraycounter[5]++;}
        else {break;}


    }
    System.out.println("Nach " + schleifencounter +" durchläufen haben sich folgende Zahlen ergeben");
    System.out.println("Die 1. " + arraycounter[0] + "x");
    System.out.println("Die 2. " + arraycounter[1] + "x");
    System.out.println("Die 3. " + arraycounter[2] + "x");
    System.out.println("Die 4. " + arraycounter[3] + "x");
    System.out.println("Die 5. " + arraycounter[4] + "x");
    System.out.println("Die 6. " + arraycounter[5] + "x");

    }
}