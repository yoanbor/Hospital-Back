package co.simplon.hospitol.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name", length = 50)
    private String name;

    @Basic
    @Column(name = "firstname", length = 50)
    private String firstname;

    @Basic
    @Column(name = "email", length = 50)
    private String email;

    @Basic
    @Column(name = "pwd", length = 50)
    private String pwd;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt")
    private Timestamp creationDT;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_dt")
    private Timestamp modificationDT;

    @OneToMany
    @JoinColumn(name = "id_role")
    private List<Role> roles;

}
