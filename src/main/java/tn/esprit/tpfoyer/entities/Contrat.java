package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    @Column(nullable = false)
    private LocalDate dateSignature;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal montantTotal;

    @Column(nullable = false)
    private boolean valide;

    @OneToOne
    @JoinColumn(name = "id_reservation", nullable = false, unique = true)
    @ToString.Exclude
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat")
    @ToString.Exclude
    private Set<Paiement> paiements = new HashSet<>();
}
