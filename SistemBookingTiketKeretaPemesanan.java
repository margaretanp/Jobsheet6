import java.util.Scanner;

public class SistemBookingTiketKeretaPemesanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        
        int jml_hari_booking, jml_booking;
        double total;
        String asal, tujuan, multi_pengguna = "";
        String pilih_kursi = "";
        double diskon, biaya, harga_tiket, presentase_diskon = 0.20;

        System.out.println("Selamat datang di Layanan Pemesanan Kereta");
        System.out.println("Silahkan input data anda...");
        System.out.println("Nama penumpang: ");
        multi_pengguna = str.nextLine();
        System.out.println("Stasiun asal (Contoh pengisian : Blitar) : ");
        asal = str.nextLine();
        System.out.println("Stasiun tujuan (Contoh pengisian : Malang): ");
        tujuan = str.nextLine();
        System.out.println("Masukkan jumlah penumpang (Contoh pengisian : 2) : ");
        jml_booking = input.nextInt();
        System.out.println("Pilih kursi (Contoh pengisian : 12 A) : ");
        pilih_kursi = str.nextLine();

        if(jml_booking >= 10){
            System.out.println("Tiket tidak tersedia");
            if (jml_booking >= 70)
            System.out.println("Pemesanan khusus gerbong hanya dilayani di stasiun");
            else if (jml_booking >= 100)
            System.out.println("Hubungi Call Center untuk pemesanan Prioritas");
        }else
        System.out.println("Tiket Tersedia");

        //System.out.println("Masukkan Kelas Kereta (Ekonomi/Bisnis/Eksekutif) : ");
        //kelas = input.nextLine();

        System.out.println("Harga tiket: ");
        harga_tiket =input.nextInt();
        
        diskon = harga_tiket*presentase_diskon;
        biaya = jml_booking * harga_tiket;
        total = (jml_booking * harga_tiket) - diskon;
        
        System.out.println("Nama penumpang: " + multi_pengguna);
        System.out.println("Stasiun asal: " + asal);
        System.out.println("Stasiun tujuan: " + tujuan);
        System.out.println("Kursi: " + pilih_kursi);
        System.out.println("Biaya yang harus dibayarkan : " + biaya);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total: " + total);
    }
}
