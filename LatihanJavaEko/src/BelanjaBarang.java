import java.util.Scanner;

public class BelanjaBarang {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int keyboard, mouse, monitor, cpu;
        int totalHarga;
        int totalJumlah;
        int sisaUang;

        System.out.print("Masukkan jumlah keyboard(Rp. 105.000,00) = ");
        keyboard = input.nextInt();
        System.out.print("Masukkan jumlah mouse(Rp. 65.000,00) = ");
        mouse = input.nextInt();
        System.out.print("Masukkan jumlah monitor(Rp. 1.500.000,00) = ");
        monitor = input.nextInt();
        System.out.print("Masukkan jumlah CPU(Rp. 3.500.000,00) = ");
        cpu = input.nextInt();

        totalHarga = (105000*keyboard) + (65000*mouse) + (1500000*monitor) + (3500000*cpu);
        totalJumlah = keyboard + mouse + monitor + cpu;
        sisaUang = 100000000 - totalHarga;

        System.out.println();
        System.out.println("Total jumlah pembelian barang-barang untuk Lab adalah " + totalJumlah + " unit.");
        System.out.println("Uang sisa belanja barang adalah Rp. " + sisaUang);


        input.close();
    }
}