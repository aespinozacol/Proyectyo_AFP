package com.afp.Proyectyo_AFP.service;

import com.afp.Proyectyo_AFP.model.AFP;

import java.util.List;

public interface AFPService {

    List<AFP> findAll();

    AFP create(AFP afp);

    AFP update(AFP afp);

    AFP findById(long id);

    void delete(long id);

}
