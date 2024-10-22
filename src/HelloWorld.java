package codelab1modul3.src;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Menampilkan pesan "Hello, World!"
        System.out.println("Hello, World!");

        // Membuat scanner untuk membaca input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Menampilkan pesan dengan nama yang dimasukkan pengguna
        System.out.println("Halo, " + nama + "! Selamat datang di program sederhana ini.");

        // Menutup scanner
        scanner.close();
    }
}
