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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Logger {

    //Transaction Id, Date, Time, Principle, Operation
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private LocalDate transactionDate;
    private LocalTime transactionTime;
    private String principle;
    private String operation;
}
