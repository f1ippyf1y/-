import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PR12 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, 3, 15);

        int age = Period.between(birthday, today).getYears();

        LocalDate nextBirthday = birthday.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntilNextBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Сегодня: " + today.format(formatter));
        System.out.println("Дата рождения: " + birthday.format(formatter));
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Следующий день рождения: " + nextBirthday.format(formatter));
        System.out.println("Дней до следующего дня рождения: " + daysUntilNextBirthday);
    }
}