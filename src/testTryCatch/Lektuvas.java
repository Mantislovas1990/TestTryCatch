package testTryCatch;

import java.util.Random;

public class Lektuvas {

    public void issklesitiVaziuokle() {
        try {
            vaziuokle();
            System.out.println("OK: Vaziuokle sekmingai isskleista");
        }catch ()
    }

     void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int random = rand.nextInt(10);
        switch (random){
            case 0 :
                throw new VaziuoklesIsskleidimoKlaida("neatsidare durys");
            case 1:
                throw new VaziuoklesIsskleidimoKlaida("nenusileido ratas");
            case 2:
                throw new VaziuoklesIsskleidimoKlaida("sandarumas pazeistas");
        }
    }
}
