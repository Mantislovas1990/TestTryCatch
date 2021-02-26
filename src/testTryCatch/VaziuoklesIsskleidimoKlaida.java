package testTryCatch;

public class VaziuoklesIsskleidimoKlaida extends Exception {
    private Exception priezastis;

    public VaziuoklesIsskleidimoKlaida(Exception priezastis) {
        this.priezastis = priezastis;
    }

    public Exception getPriezastis() {
        return this.priezastis;
    }
}
