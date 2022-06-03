package com.afp.Proyectyo_AFP.service.implement;

import com.afp.Proyectyo_AFP.model.AFPAssociation;
import com.afp.Proyectyo_AFP.repository.AFPAssociationRepository;
import com.afp.Proyectyo_AFP.service.AFPAssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AFPAssociationServiceImpl implements AFPAssociationService {

    @Autowired
    AFPAssociationRepository afpAssociationRepository;

    @Override
    public List<AFPAssociation> findAll() {
        return afpAssociationRepository.findAll();
    }

    @Override
    public AFPAssociation create(AFPAssociation afpAssociation) {
        return afpAssociationRepository.save(afpAssociation);
    }

    @Override
    public AFPAssociation update(AFPAssociation afpAssociation) {
        return afpAssociationRepository.save(afpAssociation);
    }

    @Override
    public AFPAssociation findById(long id) {
        Optional<AFPAssociation> op = afpAssociationRepository.findById(id);
        return op.isPresent() ? op.get() : new AFPAssociation();
    }

    @Override
    public void delete(long id) {
        afpAssociationRepository.deleteById(id);
    }


}
