package com.afp.Proyectyo_AFP.api;

import com.afp.Proyectyo_AFP.model.AFP;
import com.afp.Proyectyo_AFP.service.AFPService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Para expóner apirest
@RequestMapping(value = "afps") //Define recursos al cual esta relacionado el api
@Slf4j
public class AFPApi {
    @Autowired
    AFPService afpService;

    @GetMapping
    public ResponseEntity<List<AFP>> findAll(){
        log.info("Aqui retorna la lista de AFPs");
        return ResponseEntity.ok(afpService.findAll());
    }

    @PostMapping //Post
    public ResponseEntity<AFP> create(@RequestBody AFP afp){
        AFP response = afpService.create(afp);
        return new ResponseEntity<AFP>(response, HttpStatus.CREATED);
    }

    @PutMapping //Post
    public ResponseEntity<AFP> update(@RequestBody AFP afp){
        AFP response = afpService.update(afp);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AFP> findById(@PathVariable("id") long id){
        return ResponseEntity.ok(afpService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id){
        afpService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
