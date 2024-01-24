package miu.edu.lab1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long task_id;
    private String description;
    @ManyToOne
    @JoinColumn(name="event_id")
    Event event;

}
