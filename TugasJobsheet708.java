import java.util.Scanner;

public class TugasJobsheet708 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int HargaTiket = 50000;
        int jumlahTiket = 0;
        int totaltiket = 0;
        double Penjualan = 0;

        for (int i = 1; i <=100 ; i++) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("transaksi selesai.");
                break;
            }
            double totalHarga = jumlahTiket * HargaTiket;
            double diskon = 0;
            if (jumlahTiket >= 10) {
                diskon = 0.15 * totalHarga;
            } else if (jumlahTiket >= 4) {
                diskon = 0.10 * totalHarga;
            } else {
                diskon = 0;
            }

            double hargabayar = totalHarga - diskon;
            totaltiket += jumlahTiket;
            Penjualan += hargabayar;

           System.out.println("\n===== Pembelian Tiket =====");
            System.out.println("Jumlah Tiket : " + jumlahTiket);
            System.out.println("Harga Total  : Rp " + totalHarga);
            System.out.println("Diskon       : Rp " + diskon);
            System.out.println("Total Bayar  : Rp " + hargabayar);
            System.out.println("==============================\n");
        }

        sc.close();

         
        }

    }
