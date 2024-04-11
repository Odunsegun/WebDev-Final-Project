package com.example.demo.service;

import com.example.demo.model.ProvidedService;
import com.example.demo.repository.ProvidedServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvidedServiceService {

    private final ProvidedServiceRepository providedServiceRepository;

    @Autowired
    public ProvidedServiceService(ProvidedServiceRepository providedServiceRepository) {
        this.providedServiceRepository = providedServiceRepository;
    }

    //add or update a provided service (save operation)
    public ProvidedService saveProvidedService(ProvidedService providedService) {
        return providedServiceRepository.save(providedService);
    }

    //fetch all provided services
    public List<ProvidedService> getAllProvidedServices() {
        return providedServiceRepository.findAll();
    }

    //fetch a single provided service by ID
    public Optional<ProvidedService> getProvidedServiceById(Long id) {
        return providedServiceRepository.findById(id);
    }

    //delete a provided service by ID
    public void deleteProvidedService(Long id) {
        providedServiceRepository.deleteById(id);
    }
}
