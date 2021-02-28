package testTryCatch;

import java.util.Random;

public class Lektuvas {

    public void issklesitiVaziuokle() {
        try {
            vaziuokle();
            System.out.println("OK: Vaziuokle sekmingai isskleista");
        }catch (LaikinaKlaida exception){
            System.out.println("ERROR: nepavuko isskleisti vaziuokles. Priezastis: " + exception.getPriezastis() + ". Svarbumas: Laikina");
        }catch (SvarbiKlaida exception){
            System.out.println("ERROR: nepavuko isskleisti vaziuokles. Priezastis: " + exception.getPriezastis() + ". Svarbumas: Svarbu");
        }catch (VaziuoklesIsskleidimoKlaida exception){
            System.out.println("ERROR: nepavuko isskleisti vaziuokles. Priezastis: " + exception.getPriezastis() + ". Svarbumas: Nezinoma");
        }
    }

     private void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int random = rand.nextInt(10);
        switch (random){
            case 0 :
                throw new SvarbiKlaida("neatsidare durys");
            case 1:
                throw new SvarbiKlaida("nenusileido ratas");
            case 2:
                throw new LaikinaKlaida("per didelis greitis");
        }
    }
}
