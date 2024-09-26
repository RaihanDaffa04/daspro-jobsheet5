import java.util.Scanner;

public class PemilihanBilangan25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hasil;
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        hasil = angka % 2 == 0 ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " merupakan " + hasil);
        input.close();
    }
    
}