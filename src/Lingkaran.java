public class Lingkaran extends RumusBangunDatar {
    private double jariJari;
    public Lingkaran(double r) {
        jariJari = r;
    }
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
