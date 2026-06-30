import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PR10 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Анна", "Борис", "Виктор", "Галина");

        try (FileWriter writer = new FileWriter("students.txt")) {
            for (String name : students) {
                writer.write(name + System.lineSeparator());
            }
            System.out.println("Список студентов сохранён в файл students.txt");
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
        }

        try {
            List<String> loadedStudents = Files.readAllLines(Paths.get("students.txt"));
            System.out.println("Список студентов из файла:");
            for (String name : loadedStudents) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}