import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Daftar Tugas Sederhana ---");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Lihat Daftar Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Membersihkan buffer input

            switch (choice) {
                case 1:
                    // Tambah tugas
                    System.out.print("Masukkan tugas yang ingin ditambahkan: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;

                case 2:
                    // Hapus tugas
                    System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    break;

                case 3:
                    // Lihat daftar tugas
                    toDoList.printTasks();
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih! Sampai jumpa.");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
