import java.util.ArrayList;
import java.util.Collections;

public class PR8 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Купить продукты");
        tasks.add("Сделать домашнее задание");
        tasks.add("Позвонить другу");

        System.out.println("Исходный список задач:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        if (tasks.size() > 1) {
            tasks.remove(1);
            System.out.println("\nВторая задача удалена.");
        }

        String target = "Ваша задача";
        if (tasks.contains(target)) {
            System.out.println("\nЗадача \"" + target + "\" найдена в списке.");
        } else {
            System.out.println("\nЗадача \"" + target + "\" не найдена в списке.");
        }

        Collections.sort(tasks);
        System.out.println("\nОтсортированный список задач:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}