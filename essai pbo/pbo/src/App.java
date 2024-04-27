import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.println("Silakan pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
        int choice = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Hasil penjumlahan: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Hasil pengurangan: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Hasil perkalian: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan.");
                } else {
                    result = num1 / num2;
                    System.out.println("Hasil pembagian: " + result);
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();}
    
    }
        
    
55
 
 

