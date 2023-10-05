import java.util.Scanner;

public class SistemTiketBookingKeretaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di menu KAI POLINEMA");
        System.out.println("1. Layanan Informasi Kereta");
        System.out.println("2. Menu Pemesanan Kereta");
        System.out.println("3. Bantuan (Call Center) KAI Polinema");
        System.out.print("Masukkan Menu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Anda telah masuk di layanan Kereta KAI POLINEMA");
                System.out.println("Informasi apa yang anda butuhkan?");
                System.out.println("1. Kereta Ekonomi");
                System.out.println("2. Kereta Bisnis");
                System.out.println("3. Kereta Eksekutif");
                menu = input.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Informasi Kereta Ekonomi");
                        break;
                    case 2:
                        System.out.println("Informasi Kereta Bisnis");
                        break;
                    case 3:
                        System.out.println("Informasi Kereta Eksekutif");
                        break;
                    default:
                        System.out.println("Maaf, input yang Anda masukkan salah.");
                        break;
                }
                break;
            case 2:
                System.out.println("Anda telah masuk ke Layanan Pemenasanan Kereta");
                System.out.println("Silahkan input data anda...");
                break;
            case 3:
                System.out.println("Anda telah masuk dilayanan Call Center");
                System.out.println("Kontak Call Center Kami: ");
                System.out.println("Telepon (Fast Respon) : 089529518500");
                System.out.println("WhatsApp: 089529518500");
                System.out.println("Email: margaretanovia1911@gmail.com");
                break;
            
            default:
                System.out.println("Maaf, input yang Anda masukkan salah ");
                break;    
        }
    }
}
