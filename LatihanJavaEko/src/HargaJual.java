import java.util.Scanner;

public class HargaJual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int keuntungan;
        double hargaBeli;
        double hargaJual;

        System.out.print("Masukkan untung yang diperoleh: ");
        keuntungan = input.nextInt();

        hargaBeli = keuntungan / 0.17;

        hargaJual = hargaBeli + keuntungan;

        System.out.println("Harga jual barang tersebut adalah Rp." + hargaJual);

        input.close();

    }
}
