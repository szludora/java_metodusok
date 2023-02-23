package com.mycompany.metodusok;


public class Metodusok {

    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        String kimenet = "Az első 10 szám összege: " + osszeg + "\n";
        kiir(kimenet);
        
        int szam = 7, masikszam = 4;
        osszeg = osszead(szam, masikszam);
        kiir("%d + %d = %d\n".formatted(szam, masikszam, osszeg));
        
        int szam1 = 4, szam2 = 3, szam3 = 6, szam4 = 9;
        int elso = osszead(szam1, szam2);
        int masodik = osszead(szam3, szam4);
        int eredmeny = osszead(elso, masodik);
        kiir("%d + %d + %d + %d = %d\n".formatted(szam1, szam2, szam3, szam4, eredmeny));
    }
    
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int osszead(int a, int b) {
            return a+b;
}
    
    private static void kiir(String szoveg) {
        System.out.printf(szoveg);
    }
}
