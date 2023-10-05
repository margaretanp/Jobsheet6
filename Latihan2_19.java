import java.util.Scanner;

public class Latihan2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buku;
        double hargaBuku;
        int jumlahBuku;
        double diskon = 0;

        System.out.println("Buku: ");
        buku = sc.nextLine();
        System.out.println("Harga: ");
        hargaBuku = sc.nextDouble();
        System.out.println("Jumlah: ");
        jumlahBuku = sc.nextInt();

        if(buku.equalsIgnoreCase("kamus")) {
            diskon += 0.10;
            if(buku.equalsIgnoreCase("kamus") && jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if(buku.equalsIgnoreCase("novel")) {
            diskon += 0.07;
            if(buku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else if(!buku.equalsIgnoreCase("kamus") && !buku.equalsIgnoreCase("novel")) {
            if(jumlahBuku > 3) {
                diskon += 0.05;
            }
        }

        double total = (hargaBuku * jumlahBuku) - (diskon * hargaBuku * jumlahBuku); 

        System.out.println("Total diskon: " + diskon);
        System.out.println("Total harga: " + total);
    }
}
