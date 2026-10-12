package tn.esprit.tpfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tpfoyer.entities.enums.StatutReservation;

import java.time.LocalDate;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    @Column(nullable = false)
    private LocalDate dateDebut;

    @Column(nullable = false)
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatutReservation statut;

    @ManyToOne
    @JoinColumn(name = "id_vehicule", nullable = false)
    @ToString.Exclude
    private Vehicule vehicule;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    @ToString.Exclude
    private Client client;

    @OneToOne(mappedBy = "reservation")
    @JsonIgnore
    @ToString.Exclude
    private Contrat contrat;
}
