package testTryCatch;

import java.util.Random;

public class Lektuvas {

    public void issklesitiVaziuokle() {
        Random rand = new Random();
        int random = rand.nextInt(10);
        int betkoksSkaicius = 100;
        try {
            int dalyba = betkoksSkaicius / random;
            if (random != 5) {
                System.out.println(betkoksSkaicius + "/" + random + " = " + dalyba + " OK: vaziuokle sekmingai isskleista");
            }
        } catch (ArithmeticException exception) {
            System.out.println("ERROR: vaziuokles issklesiti nepavyko " + exception);
        }

        try {
            if (random == 5) {
                "Skrendu".charAt(20);
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("ERROR: nepavyko isskleisti vaziuokles del kitos klaidos: " + random);
        } finally {
            System.out.println("INFO: lektuvas skrenda");
        }
    }

    public void vaziuokle() {
        Random rand = new Random();
        int random = rand.nextInt(10);
        switch (random){
            case 0:
                System.out.println("neatsidare durys");
                break;
            case 1:
                System.out.println("nenusileido ratas");
                break;
            case 2:
                System.out.println("sandarumas pazeistas");
                break;
            case 3:
                System.out.println("trenke zaibas");
                break;
            case 4:
                System.out.println("susidure su pauksciais");
                break;
            case 5:
                System.out.println("kuro nutekejimas");
                break;
            case 6:
                System.out.println("Uzgeso variklis");
                break;
            case 7:
                System.out.println("uzsalo asis");
                break;
            case 8:
                System.out.println("elektros problemos");
                break;
            case 9:
                System.out.println("per didelis greitis");
                break;
        }
    }
}
