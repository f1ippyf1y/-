import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class PR13 {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        studentList.add("Иван");
        studentList.add("Мария");
        studentList.add("Петр");
        studentList.add("Анна");
        studentList.add("Иван");

        System.out.println("Список студентов (ArrayList): " + studentList);

        Set<String> uniqueStudents = new HashSet<>(studentList);
        System.out.println("Уникальные студенты (HashSet): " + uniqueStudents);

        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Иван", 85);
        studentScores.put("Мария", 92);
        studentScores.put("Петр", 78);
        studentScores.put("Анна", 90);

        System.out.println("\nОценки студентов (HashMap):");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}