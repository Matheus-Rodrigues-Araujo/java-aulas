import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            Worker wk1 = new Worker("Diego", WorkerLevel.JUNIOR, 1200.00, new Department("Design"));
            HourContract ctc1 = new HourContract(LocalDate.parse("08/08/2024", formatter), 50.00, 20);
            HourContract ctc2 = new HourContract(LocalDate.parse("18/08/2024", formatter), 80.00, 10);
            wk1.addContract(ctc1);
            wk1.addContract(ctc2);

            System.out.println("Name: " + wk1.getName());
            System.out.println("Income for 08/2024: " +
                    wk1.income(2024, 8));
            System.out.println("Department: " + wk1.getDepartment().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
