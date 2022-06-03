package com.afp.Proyectyo_AFP.service;

import com.afp.Proyectyo_AFP.model.AFPAssociation;

import java.util.List;

public interface AFPAssociationService {

    List<AFPAssociation> findAll();

    AFPAssociation create(AFPAssociation afpAssociation);

    AFPAssociation update(AFPAssociation afpAssociation);

    AFPAssociation findById(long id);

    void delete(long id);

}
