package miu.edu.lab1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExceptionLogger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private LocalDate transactionDate;
    private LocalTime transactionTime;
    private String principle;
    private String operation;
    private String exceptionType;

    public ExceptionLogger(LocalDate now, LocalTime now1, String admin, String name, String name1) {
        this.transactionDate=now;
        this.transactionTime=now1;
        this.principle=admin;
        this.operation=name;
        this.exceptionType=name1;
    }
}
