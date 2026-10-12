package tn.esprit.tpfoyer.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Agence;
import tn.esprit.tpfoyer.repository.AgenceRepository;
import tn.esprit.tpfoyer.service.interfaces.IAgenceService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private AgenceRepository agenceRepository;

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Agence> getAllAgences() {
        return new HashSet<>(agenceRepository.findAll());
    }
}
