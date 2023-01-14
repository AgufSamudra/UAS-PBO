public class Balok implements IBangunDatar {

    private double panjang;
    private RumusBangunDatar lebar;
    public Balok(double p, double l) {
        panjang = p;
        lebar = new Persegi(l);
    }
    public double hitungLuas() {
        return panjang * lebar.hitungLuas() / panjang;
    }

    public double hitungKeliling() {
        return 4 * panjang * lebar.hitungKeliling() / panjang;
    }
}
