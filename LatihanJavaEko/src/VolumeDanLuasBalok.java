import java.util.Scanner;

public class VolumeDanLuasBalok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int panjang, lebar, tinggi;
        int volume;
        int luas;

        System.out.print("Masukkan panjang balok: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar balok: ");
        lebar = input.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        tinggi = input.nextInt();

        volume = panjang * lebar * tinggi;

        luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

        System.out.println();
        System.out.println("Volume balok adalah " + volume);
        System.out.println("Luas permukaan balok adalah " + luas);

        input.close();

    }
}
