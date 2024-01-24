package miu.edu.lab1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coordinator {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //@ManyToMany(mappedBy = "")
    //@JoinTable(name="Coordinator_Task")
    private long co_id;
    private String name;
    private String gender;

    @ManyToMany(cascade= CascadeType.ALL)
    @JoinTable(name="Coordinator_Event",
            joinColumns = @JoinColumn(name="event_id"),
            inverseJoinColumns = @JoinColumn(name="co_id"))
    List<Event> events;

    @OneToOne
    @JoinColumn(name="address_id")
    Address address;

}
