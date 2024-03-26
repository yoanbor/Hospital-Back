package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "Service")
public class Service {

    @Id
    @Column(name = "id_service")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name", length = 50)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt")
    private Timestamp creationDT;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_dt")
    private Timestamp modificationDT;

    @OneToMany
    @JoinColumn(name = "id_bed")
    private List<Bed> beds;

}
