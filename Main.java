import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<LayananTransportasi> daftar = new ArrayList<>();

        // Tambahkan objek
        daftar.add(new MadiunMotor("Edo", 5, 2000000));
        daftar.add(new MadiunMobil("Adi", 3, 1500000));

        // Looping (Polymorphism)
        for (LayananTransportasi layanan : daftar) {
            System.out.println("Tarif: Rp " + layanan.hitungTarif());
            layanan.prosesTransaksi();
            System.out.println("-----------------------------------");
        }
    }
}