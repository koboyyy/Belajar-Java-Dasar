import java.util.Scanner;

public class HargaDiskon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahBaju;
        int jumlahCelana;

        double diskonBaju;
        double diskonCelana;

        double totalHarga;

        System.out.print("Masukkan jumlah kaos (Rp. 180.000,00): ");
        jumlahBaju = input.nextInt();

        System.out.print("Masukkan jumlah celana (Rp. 300.000,00): ");
        jumlahCelana = input.nextInt();

        diskonBaju =  jumlahBaju * (180000*(1-0.15));
        diskonCelana = jumlahCelana * (300000*(1-0.20));

        totalHarga = diskonBaju + diskonCelana;

        System.out.println("Uang yang dibayarkan Sari adalah Rp." + totalHarga);
    }
}
