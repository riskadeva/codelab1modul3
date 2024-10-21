import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList














            () {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Tugas berhasil ditambahkan!");
    }

    public void removeTask(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Tugas berhasil dihapus!");
        } else {
            System.out.println("Nomor tugas tidak valid.");
        }
    }

    public void printTasks() {
        System.out.println("\n--- Daftar Tugas ---");
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}