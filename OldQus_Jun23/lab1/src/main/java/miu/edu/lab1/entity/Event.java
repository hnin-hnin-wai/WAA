package miu.edu.lab1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_id;
    private String title;
    private String state;
    //private List<Coordinator> coordinators;
    @ManyToMany(mappedBy = "events")

    List<Coordinator> coordinators;

    @OneToMany(mappedBy ="event")

    List<Task> tasks;
}
