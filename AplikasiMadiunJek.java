abstract class LayananTransportasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;

    public LayananTransportasi(String namaDriver, double jarak, double saldoUser) {
        this.namaDriver = namaDriver;
        
        if (jarak <= 0) {
            this.jarak = 1;
        } else {
            this.jarak = jarak;
        }

        this.saldoUser = saldoUser;
    }

    public abstract double hitungTarif();

    public abstract void prosesTransaksi();
}

class MadiunMotor extends LayananTransportasi {

    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        return jarak * 2500;
    }

    @Override
    public void prosesTransaksi() {
        System.out.println("SETYO ARYO WIGUNO- 254311016");

        double total = hitungTarif();
        if (saldoUser >= total) {
            saldoUser -= total;
            
            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Total Bayar: Rp " + total);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan transaksi.");
        } 
    }
}

class MadiunMobil extends LayananTransportasi {

    private int duaDigitNim = 45; // contoh (ganti sesuai NIM kamu)

    public MadiunMobil(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        double tarifDasar = jarak * 5000;
        double biayaAdmin = 3000 + (duaDigitNim * 100);
        return tarifDasar + biayaAdmin;
    }

    @Override
    public void prosesTransaksi() {
        System.out.println("=== Transaksi SETYO ARYO WIGUNO - 254311016 ===");

        double total = hitungTarif();

        if (saldoUser >= total) {
            saldoUser -= total;

            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Total Bayar: Rp " + total);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}

