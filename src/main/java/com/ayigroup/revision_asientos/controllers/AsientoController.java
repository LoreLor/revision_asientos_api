package com.ayigroup.revision_asientos.controllers;

import com.ayigroup.revision_asientos.entities.Asiento;
import com.ayigroup.revision_asientos.services.AsientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/revisionasientos")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET})
public class AsientoController {

    @Autowired
    private AsientoService asientoService;


    @PostMapping
    public ResponseEntity<String> agregarAsiento(@RequestBody Asiento asiento) {
        Asiento nuevoAsiento = asientoService.agregarAsiento(asiento);
        return ResponseEntity.ok("Asiento agregado con éxito " + nuevoAsiento);
    }

    @GetMapping("/")
    public ResponseEntity<List<Asiento>> listarAsientos(){
        List<Asiento> asientos = asientoService.mostrarAsientos();
        return asientos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(asientos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asiento> mostrarAsientoPorId(@PathVariable Integer id) {
        Asiento asiento = asientoService.asientoById(id);
        return ResponseEntity.ok(asiento);
    }


}
