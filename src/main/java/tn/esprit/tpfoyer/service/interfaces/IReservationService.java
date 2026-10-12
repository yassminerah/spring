package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.Set;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Long id);

    Reservation getReservationById(Long id);

    Set<Reservation> getAllReservations();
}
