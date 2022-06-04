package com.afp.Proyectyo_AFP.service;

import com.afp.Proyectyo_AFP.model.AFPAssociation;
import com.afp.Proyectyo_AFP.model.RegistrationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController //Para expóner apirest
@RequestMapping(value = "afps") //Define recursos al cual esta relacionado el api
public interface RegistrationRequestService {
    List<RegistrationRequest> findAll();

    RegistrationRequest create(RegistrationRequest registrationRequest);

    RegistrationRequest update(RegistrationRequest registrationRequest);

    RegistrationRequest findById(long id);

    void delete(long id);

    ResponseEntity ValidacionMonto(RegistrationRequest registrationRequest, AFPAssociation afpAssociation);

}
