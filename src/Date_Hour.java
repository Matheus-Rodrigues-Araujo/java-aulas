import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Hour {
    public static void main(String[] args) {
        // Definição de formatações
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now(); // 3 horas adiantado segundo PADRÃO UTC/ Horário de Londres
        LocalDate d4 = LocalDate.parse("2024-07-21");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:25");
        Instant d6 = Instant.parse("2024-07-20T14:19:00Z");
        Instant d7 = Instant.parse("2024-07-20T01:30:26-03:00");
        //Instant d7 = Instant.parse("2024-07-20T01:30:26-03:00");
                                       //tempo adiantado=-03:00
        LocalDate d8 = LocalDate.parse("20/07/2022", fmt1); // Teste formatação 1
        LocalDateTime d9 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // Teste formatação 2

        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 12, 3, 12, 30, 25);

        System.out.println("LocalDate, LocalDateTime e Instant");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println();
        System.out.println("LocalDate, LocalDateTime e Instant com método `parse`");
        System.out.println("d4 = " + d4);
        System.out.println("d5 = " + d5);
        System.out.println("d6 = " + d6);
        System.out.println("d7 = " + d7);
        System.out.println();
        System.out.println("LocalDate & LocalDateTime com formatações");
        System.out.println("d8 com fmt1 = " + d8);
        System.out.println("d9  com fmt2 = " + d9);
        System.out.println();
        System.out.println("LocalDate & LocalDateTime com método `of` na formatação de datas e horários");
        System.out.println("d10 com formatação Date = " + d10);
        System.out.println("d10 com formatação DateTime = " + d11);
    }
}
