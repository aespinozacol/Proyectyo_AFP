package com.afp.Proyectyo_AFP.api;

import com.afp.Proyectyo_AFP.model.AFPAssociation;
import com.afp.Proyectyo_AFP.model.RegistrationRequest;
import com.afp.Proyectyo_AFP.service.RegistrationRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Para expóner apirest
@RequestMapping(value = "registrationrequests") //Define recursos al cual esta relacionado el api
@Slf4j
public class RegistrationRequestApi {
    @Autowired
    RegistrationRequestService registrationRequestService;

    @GetMapping
    public ResponseEntity<List<RegistrationRequest>> findAll(){
        log.info("List all Registration Request");
        return ResponseEntity.ok(registrationRequestService.findAll());
    }

    @PostMapping //Post
    public ResponseEntity<RegistrationRequest> create(@RequestBody RegistrationRequest registrationRequest){
        RegistrationRequest response = registrationRequestService.create(registrationRequest);
        log.info("Create one Registration Request");
        return new ResponseEntity<RegistrationRequest>(response, HttpStatus.CREATED);
    }

    @PutMapping //Post
    public ResponseEntity<RegistrationRequest> update(@RequestBody RegistrationRequest registrationRequest){
        RegistrationRequest response = registrationRequestService.update(registrationRequest);
        log.info("Update one Registration Request");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationRequest> findById(@PathVariable("id") long id){
        log.info("Search for one Registration Request by id");
        return ResponseEntity.ok(registrationRequestService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id){
        registrationRequestService.delete(id);
        log.info("Delete one Registration Request");
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping(value = "ValidacionMonto")
    public ResponseEntity<String> ValidacionMonto(@RequestBody RegistrationRequest registrationRequest, AFPAssociation afpAssociation){
        registrationRequestService.ValidacionMonto(registrationRequest, afpAssociation);
        return new ResponseEntity<>("Se guardo correctamente",HttpStatus.CREATED);
    }
}
