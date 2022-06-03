package com.afp.Proyectyo_AFP.service.implement;

import com.afp.Proyectyo_AFP.model.AFPAssociation;
import com.afp.Proyectyo_AFP.model.RegistrationRequest;
import com.afp.Proyectyo_AFP.repository.AFPAssociationRepository;
import com.afp.Proyectyo_AFP.repository.RegistrationRequestRepository;
import com.afp.Proyectyo_AFP.service.RegistrationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationRequestServiceImpl implements RegistrationRequestService {

    @Autowired
    RegistrationRequestRepository registrationRequestRepository;

    @Override
    public List<RegistrationRequest> findAll() {
        return registrationRequestRepository.findAll();
    }

    @Override
    public RegistrationRequest create(RegistrationRequest registrationRequest) {
        return registrationRequestRepository.save(registrationRequest);
    }

    @Override
    public RegistrationRequest update(RegistrationRequest registrationRequest) {
        return registrationRequestRepository.save(registrationRequest);
    }

    @Override
    public RegistrationRequest findById(long id) {
        Optional<RegistrationRequest> op = registrationRequestRepository.findById(id);
        return op.isPresent() ? op.get() : new RegistrationRequest();
    }

    @Override
    public void delete(long id) {
        registrationRequestRepository.deleteById(id);
    }
}
