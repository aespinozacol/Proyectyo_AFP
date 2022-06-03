package com.afp.Proyectyo_AFP.api;

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
        log.info("Aqui retorna la lista de Registros de solicitud");
        return ResponseEntity.ok(registrationRequestService.findAll());
    }

    @PostMapping //Post
    public ResponseEntity<RegistrationRequest> create(@RequestBody RegistrationRequest registrationRequest){
        RegistrationRequest response = registrationRequestService.create(registrationRequest);
        return new ResponseEntity<RegistrationRequest>(response, HttpStatus.CREATED);
    }

    @PutMapping //Post
    public ResponseEntity<RegistrationRequest> update(@RequestBody RegistrationRequest registrationRequest){
        RegistrationRequest response = registrationRequestService.update(registrationRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationRequest> findById(@PathVariable("id") long id){
        return ResponseEntity.ok(registrationRequestService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id){
        registrationRequestService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
