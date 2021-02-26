package testTryCatch;

import java.util.Random;

public class Lektuvas {

    public void issklesitiVaziuokle() {
        Random rand = new Random();
        int random = rand.nextInt(10);
        int betkoksSkaicius = 100;
        try {
            int dalyba = betkoksSkaicius / random;
            if(random != 5){
                System.out.println(betkoksSkaicius + "/" + random + " = " + dalyba + " OK: vaziuokle sekmingai isskleista");
            }
        } catch (ArithmeticException exception) {
            System.out.println("ERROR: vaziuokles issklesiti nepavyko " +exception);
        }

        try{
            if(random == 5){
                "Skrendu".charAt(20);
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("ERROR: nepavyko isskleisti vaziuokles del kitos klaidos: " + random);
        }finally {
            System.out.println("INFO: lektuvas skrenda");
        }
    }
}
