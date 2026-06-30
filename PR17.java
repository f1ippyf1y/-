import java.util.HashMap;
import java.util.Map;

public class PR17 {
    public static void main(String[] args) {
        Map<String, Integer> journal = new HashMap<>();
        journal.put("Анна", 85);
        journal.put("Борис", 92);
        journal.put("Виктор", 74);
        journal.put("Галина", 88);
        journal.put("Дмитрий", 96);

        String name = "Виктор";
        System.out.println("Оценка студента " + name + ": " + journal.get(name));

        String checkName = "Иван";
        if (journal.containsKey(checkName)) {
            System.out.println("Студент " + checkName + " есть в журнале.");
        } else {
            System.out.println("Студента " + checkName + " нет в журнале.");
        }

        journal.remove("Анна");
        System.out.println("\nЖурнал после удаления Анны:");
        for (Map.Entry<String, Integer> entry : journal.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}