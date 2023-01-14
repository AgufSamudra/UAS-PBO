public class Persegi extends RumusBangunDatar {
    private double sisi;
    public Persegi(double s) {
        sisi = s;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}
