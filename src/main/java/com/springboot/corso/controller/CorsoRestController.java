package com.springboot.corso.controller;

import com.springboot.corso.controller.interfaces.CorsoApi;
import com.springboot.corso.entity.Corso;
import com.springboot.corso.service.interfaces.CorsoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corso")
public class CorsoRestController implements CorsoApi {

    private CorsoService corsoService;

    public CorsoRestController(CorsoService corsoService){
        this.corsoService = corsoService;
    }

    @GetMapping()
    public List<Corso> getAllCorsi(){
        return corsoService.getAll();
    }

    @GetMapping("/{idCorso}")
    public Corso getCorsoById(@PathVariable Integer idCorso){
        return corsoService.getById(idCorso);
    }

    @PostMapping()
    public Corso insertCorso(@RequestBody Corso corso){
        return corsoService.save(corso);
    }

    @PutMapping()
    public Corso updateCorso(@RequestBody Corso corso){
        return corsoService.save(corso);
    }

    @DeleteMapping("/{idCorso}")
    public void deleteCorsoById(@PathVariable Integer idCorso){
        corsoService.deleteById(idCorso);
    }
}
