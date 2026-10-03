package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tpfoyer.entities.enums.RoleEmploye;

@Entity
@Table(name = "employe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String prenom;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private RoleEmploye role;

    @ManyToOne
    @JoinColumn(name = "id_agence")
    @ToString.Exclude
    private Agence agence;
}
