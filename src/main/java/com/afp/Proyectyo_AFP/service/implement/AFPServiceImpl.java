package com.afp.Proyectyo_AFP.service.implement;

import com.afp.Proyectyo_AFP.model.AFP;
import com.afp.Proyectyo_AFP.repository.AFPRepository;
import com.afp.Proyectyo_AFP.service.AFPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AFPServiceImpl implements AFPService {

    @Autowired
    AFPRepository afpRepository;

    @Override
    public List<AFP> findAll() {
        return afpRepository.findAll();
    }

    @Override
    public AFP create(AFP afp) {
        return afpRepository.save(afp);
    }

    @Override
    public AFP update(AFP afp) {
        return afpRepository.save(afp);
    }

    @Override
    public AFP findById(long id) {
        Optional<AFP> op = afpRepository.findById(id);
        return op.isPresent() ? op.get() : new AFP();
    }

    @Override
    public void delete(long id) {
        afpRepository.deleteById(id);
    }
}
