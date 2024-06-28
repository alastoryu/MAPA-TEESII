import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Faltam apenas: " + ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2024, 12, 31))
                + " dias para o ano novo!");

    }
}
