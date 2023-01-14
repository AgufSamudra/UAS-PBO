import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BangunDatar extends JFrame implements ActionListener {
    private JLabel labelBangunDatar, labelNilai1, labelNilai2, labelLuas, labelKeliling;
    private JComboBox comboBangunDatar;
    private JTextField textNilai1, textNilai2;
    private JButton buttonHitung;

    public BangunDatar() {
        setTitle("Hitung Luas Bangun Datar");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelBangunDatar = new JLabel("Bangun Datar");
        labelBangunDatar.setBounds(20, 20, 100, 20);
        add(labelBangunDatar);

        comboBangunDatar = new JComboBox(new String[]{"Persegi", "Persegi Panjang", "Lingkaran"});
        comboBangunDatar.setBounds(130, 20, 150, 20);
        add(comboBangunDatar);

        labelNilai1 = new JLabel("Nilai 1");
        labelNilai1.setBounds(20, 50, 100, 20);
        add(labelNilai1);

        textNilai1 = new JTextField();
        textNilai1.setBounds(130, 50, 150, 20);
        add(textNilai1);

        labelNilai2 = new JLabel("Nilai 2");
        labelNilai2.setBounds(20, 80, 100, 20);
        add(labelNilai2);

        textNilai2 = new JTextField();
        textNilai2.setBounds(130, 80, 150, 20);
        add(textNilai2);

        buttonHitung = new JButton("Hitung");
        buttonHitung.setBounds(100, 110, 100, 20);
        add(buttonHitung);
        buttonHitung.addActionListener(this);

        labelLuas = new JLabel();
        labelLuas.setBounds(20, 140, 250, 20);
        add(labelLuas);

        labelKeliling = new JLabel();
        labelKeliling.setBounds(20, 160, 250, 20);
        add(labelKeliling);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String bangunDatar = (String) comboBangunDatar.getSelectedItem();
        double nilai1 = Double.parseDouble(textNilai1.getText());
        double nilai2 = Double.parseDouble(textNilai2.getText());
        double luas;
        double keliling;
        switch (bangunDatar) {
            case "Persegi":
                Persegi persegi = new Persegi(nilai1);
                luas = persegi.hitungLuas();
                keliling = persegi.hitungKeliling();
                break;
            case "Persegi Panjang":
                Balok balok = new Balok(nilai1, nilai2);
                luas = balok.hitungLuas();
                keliling = balok.hitungKeliling();
                break;
            case "Lingkaran":
                Lingkaran lingkaran = new Lingkaran(nilai1);
                luas = lingkaran.hitungLuas();
                keliling = lingkaran.hitungKeliling();
                break;
            default:
                luas = 0;
                keliling = 0;
                break;
        }
        labelLuas.setText("Luas: " + luas);
        labelKeliling.setText("Keliling: " + keliling);
    }

    public static void main(String[] args) {
        new BangunDatar();
    }
}