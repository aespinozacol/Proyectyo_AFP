package com.afp.Proyectyo_AFP.service.implement;

import com.afp.Proyectyo_AFP.model.AFPAssociation;
import com.afp.Proyectyo_AFP.model.RegistrationRequest;
import com.afp.Proyectyo_AFP.repository.RegistrationRequestRepository;
import com.afp.Proyectyo_AFP.service.RegistrationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @Override
    public ResponseEntity ValidacionMonto(RegistrationRequest registrationRequest, AFPAssociation afpAssociation) {
        double montoSolicitado =  registrationRequest.getWithdrawal_amount();
        double montoDisponible = afpAssociation.getAmount_available();
        double montoMinimo = montoDisponible * 0.5;

        if(montoSolicitado>montoDisponible){
            return new ResponseEntity("No se puede registrar la solicitud. Cantidad superior a la permitida "+ montoSolicitado, HttpStatus.BAD_REQUEST);
        }else if(montoSolicitado<montoMinimo){
            return new ResponseEntity("Monto solicitado no permitido, no supera el minimo "+montoSolicitado, HttpStatus.BAD_REQUEST);
        }else {
            registrationRequestRepository.save(registrationRequest);
            return new ResponseEntity("Request Accept "+montoSolicitado,HttpStatus.BAD_REQUEST);
        }
    }
}
