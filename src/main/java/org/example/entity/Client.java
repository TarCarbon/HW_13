package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "client")
@Getter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name")
    @Setter
    private String name;

    @Getter
    @OneToMany (mappedBy = "client_id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Ticket> ticket = new ArrayList<>();
}
