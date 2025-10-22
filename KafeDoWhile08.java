import java.util.Scanner;

public class KafeDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi,teh,roti;

        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;

        do {
            System.out.print("Masukkan namape langgan: (ketik 'batal' untuk keluar)");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi:");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh:");
            teh = sc.nextInt();
            System.out.print("Jumlah roti:");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus di bayar: Rp." + totalHarga);
            sc.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");

        sc.close();
    }

}