package com.mycompany.metodusok;


public class Metodusok {

    public static void main(String[] args) {
    }
    
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    private static void kiiras() {
        int osszeg = elso10SzamOsszege();
        System.out.println("Az első 10 szám összege: " + osszeg);
    }
    
    
    private static void osszead(int a, int b) {
            System.out.printf("%d + %d = %d\n", a, b, a+b);
}
}
