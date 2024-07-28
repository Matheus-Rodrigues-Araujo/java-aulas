package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getContractDate() {
        return this.date;
    }

    public Double getValuePerHour() {
        return this.valuePerHour;
    }

    public Integer getHours() {
        return this.hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

}
