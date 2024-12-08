import java.util.Scanner;

public class TotalHarga {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arrayNama = {"Laptop", "Mouse", "keyboard", "RAM 16 GB"};
        int[] hargaBarang = new int[4];
        int[] jumlahUnit = new int[4];
        int totalHarga = 0;

        for (int i = 0 ; i < hargaBarang.length ; i++){
            System.out.println((i + 1) + ". Masukkan harga dan jumlah unit " + arrayNama[i] + ": ");
            System.out.print("   Harga barang: ");
            hargaBarang[i] = scanner.nextInt();

            System.out.print("   Jumlah unit: ");
            jumlahUnit[i] = scanner.nextInt();

            totalHarga += hargaBarang[i] * jumlahUnit[i];
        }

        System.out.println();
        System.out.println("Total harga yang harus dibayarkan Dinda adalah Rp." + totalHarga + ".");

        scanner.close();
    }
}
