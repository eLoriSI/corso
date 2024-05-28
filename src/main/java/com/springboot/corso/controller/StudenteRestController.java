package com.springboot.corso.controller;

import com.springboot.corso.controller.interfaces.StudenteApi;
import com.springboot.corso.entity.Studente;
import com.springboot.corso.service.interfaces.StudenteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studente")
public class StudenteRestController implements StudenteApi {

    private StudenteService studenteService;

    public StudenteRestController(StudenteService studenteService){
        this.studenteService = studenteService;
    }

    @GetMapping()
    public List<Studente> getAllStudenti(){
        return studenteService.getAllStudenti();
    }

    @GetMapping("/{idStudente}")
    public Studente getStudenteById(@PathVariable Integer idStudente){
        return studenteService.getStudenteById(idStudente);
    }

    @PostMapping()
    public Studente insertStudente(@RequestBody Studente studente){
        return studenteService.save(studente);
    }

    @PutMapping()
    public Studente updateStudente(@RequestBody Studente studente){
        return studenteService.save(studente);
    }

    @DeleteMapping("/{idStudente}")
    public void deleteStudenteById(@PathVariable Integer idStudente){
        studenteService.deleteById(idStudente);
    }

}
