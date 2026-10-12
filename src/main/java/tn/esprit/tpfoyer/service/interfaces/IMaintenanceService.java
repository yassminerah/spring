package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Maintenance;

import java.util.Set;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance maintenance);

    Maintenance updateMaintenance(Maintenance maintenance);

    void deleteMaintenance(Long id);

    Maintenance getMaintenanceById(Long id);

    Set<Maintenance> getAllMaintenances();
}
