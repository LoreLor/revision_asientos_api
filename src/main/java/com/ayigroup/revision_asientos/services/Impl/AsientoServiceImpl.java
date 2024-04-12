package com.ayigroup.revision_asientos.services.Impl;

import com.ayigroup.revision_asientos.entities.Asiento;
import com.ayigroup.revision_asientos.repository.AsientoRepository;
import com.ayigroup.revision_asientos.services.AsientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsientoServiceImpl implements AsientoService {

    @Autowired
    private AsientoRepository asientoRepository;

    @Override
    public Asiento agregarAsiento(Asiento asiento){
        return asientoRepository.save(asiento);
    }

    @Override
    public List<Asiento> mostrarAsientos(){
        return asientoRepository.findAll();
    }

    @Override
    public Asiento asientoById(Integer id){
        return asientoRepository.findById(id).orElse(null);
    }

}
