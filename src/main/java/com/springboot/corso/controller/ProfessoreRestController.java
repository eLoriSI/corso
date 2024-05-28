package com.springboot.corso.controller;

import com.springboot.corso.controller.interfaces.ProfessoreApi;
import com.springboot.corso.entity.Professore;
import com.springboot.corso.service.interfaces.ProfessoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professore")
public class ProfessoreRestController implements ProfessoreApi {

    private ProfessoreService professoreService;

    public ProfessoreRestController(ProfessoreService professoreService){
        this.professoreService = professoreService;
    }

    @GetMapping()
    public List<Professore> getAllProfessori(){
        return professoreService.getAll();
    }

    @GetMapping("/{idProfessore}")
    public Professore getProfessoreById(@PathVariable Integer idProfessore){
        return professoreService.getById(idProfessore);
    }

    @PostMapping()
    public Professore insertProfessore(@RequestBody Professore professore){
        return professoreService.save(professore);
    }

    @PutMapping()
    public Professore updateProfessore(@RequestBody Professore professore){
        return professoreService.save(professore);
    }

    @DeleteMapping("/{idProfessore}")
    public void deleteProfessoreById(@PathVariable Integer idProfessore){
        professoreService.delete(idProfessore);
    }

}
