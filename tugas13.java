package Tugas13;

import java.util.*;

public class tugas13 {
    public static void main(String[] args) {
        int d, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah karakter: ");
        n = sc.nextInt();
        sc.nextLine(); // menghindari skipping

        String[] karakter = new String[n];

        System.out.println("");

        // input karakter
        for (d = 0; d < n; d++) {
            System.out.print("Masukkan karakter " + d + ": ");
            karakter[d] = sc.nextLine();
        }

        // print hasil
        System.out.print("Hasil: ");

        // print semua item di array
        for (d = 0; d < n; d++) {
            System.out.print(karakter[d] + " ");
        }

        // ambil item -1 dari terakhir
        for (d = n - 2; d >= 0; d--) {
            System.out.print(karakter[d] + " ");
        }

        System.out.println("");

    }
}