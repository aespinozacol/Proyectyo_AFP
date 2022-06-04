package com.afp.Proyectyo_AFP.api;

import com.afp.Proyectyo_AFP.model.AFPAssociation;
import com.afp.Proyectyo_AFP.service.AFPAssociationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Para expóner apirest
@RequestMapping(value = "afpsassociation") //Define recursos al cual esta relacionado el api
@Slf4j
public class AFPAssociationApi {
    @Autowired
    AFPAssociationService afpAssociationService;

    @GetMapping
    public ResponseEntity<List<AFPAssociation>> findAll(){
        log.info("List AFPs association");
        return ResponseEntity.ok(afpAssociationService.findAll());
    }

    @PostMapping //Post
    public ResponseEntity<AFPAssociation> create(@RequestBody AFPAssociation afpAssociation){
        AFPAssociation response = afpAssociationService.create(afpAssociation);
        log.info("Create one AFP association");
        return new ResponseEntity<AFPAssociation>(response, HttpStatus.CREATED);
    }

    @PutMapping //Post
    public ResponseEntity<AFPAssociation> update(@RequestBody AFPAssociation afpAssociation){
        AFPAssociation response = afpAssociationService.update(afpAssociation);
        log.info("Update one AFP association");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AFPAssociation> findById(@PathVariable("id") long id){
        log.info("Search for one AFP association by id");
        return ResponseEntity.ok(afpAssociationService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id){
        afpAssociationService.delete(id);
        log.info("Delete one AFP association");
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
