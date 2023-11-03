
import java.util.Scanner;

public class programKonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================Program Konversi Bilangan=================");
        System.out.println();
        System.out.print("Masukkan bilangan                                    : ");
        String number = input.nextLine();
        System.out.print("Masukkan basis bilangan (1=desimal, 2=biner, 3=hexa) : ");
        int base = input.nextInt();
        if (base == 1) {
            String binary = convertToBinary(number);
            String hex = convertToHexadecimal(number);
            System.out.printf("%s dalam basis %d : %s (biner)\n", number, base, binary);
            System.out.printf("%s dalam basis %d : %s (heksadesimal)\n", number, base, hex);
        } else if (base == 2) {
            int decimal = convertToDecimal(number, base);
            String hex = convertToHexadecimal(Integer.toString(decimal));
            System.out.printf("%s dalam basis %d : %d (desimal)\n", number, base, decimal);
            System.out.printf("%s dalam basis %d : %s (heksadesimal)\n", number, base, hex);
        } else if (base == 3) {
            int decimal = convertToDecimal(number, base);
            String binary = convertToBinary(Integer.toString(decimal));
            System.out.printf("%s dalam basis %d : %d (desimal)\n", number, base, decimal);
            System.out.printf("%s dalam basis %d : %s (biner)\n", number, base, binary);
        } else {
            System.out.println("Tidak ada di pilihan, coba lagi");
        }
        input.close();
    }

    public static String convertToBinary(String number) {
        int decimal = Integer.parseInt(number);
        return Integer.toBinaryString(decimal);
    }

    public static int convertToDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }

    public static String convertToHexadecimal(String number) {
        int decimal = Integer.parseInt(number);
        return Integer.toHexString(decimal).toUpperCase();
    }
}
