package com.afp.Proyectyo_AFP.service.implement;

import com.afp.Proyectyo_AFP.model.RegistrationRequest;
import com.afp.Proyectyo_AFP.repository.AFPAssociationRepository;
import com.afp.Proyectyo_AFP.repository.RegistrationRequestRepository;
import com.afp.Proyectyo_AFP.service.RegistrationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }

    @Override
    public RegistrationRequest update(RegistrationRequest registrationRequest) {
        return null;
    }

    @Override
    public RegistrationRequest findById(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
