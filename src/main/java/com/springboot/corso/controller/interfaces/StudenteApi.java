package com.springboot.corso.controller.interfaces;

import com.springboot.corso.entity.Corso;
import com.springboot.corso.entity.Studente;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Studente", description = "Api dello Studente")
public interface StudenteApi {

    @Operation(
            summary = "Estrarre tutti i Studente",
            description = "estrae tutte le entità studente e i loro dati dal database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public List<Studente> getAllStudenti();

    @Operation(
            summary = "Estrarre il singolo Studente",
            description = "estrae il signolo studente e i suoi dati dal database, utilizzando l'id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Studente getStudenteById(Integer idStudente);

    @Operation(
            summary = "Inserire nuovo Studente",
            description = "inserisce una nuova entità studente nel database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Studente insertStudente(Studente studente);

    @Operation(
            summary = "Aggiornare un Studente",
            description = "aggiorna un studente già esistente nel database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Studente updateStudente(Studente studente);

    @Operation(
            summary = "Rimuovere un Studente",
            description = "rimuove un studente già dal database, utilizzando l'id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public void deleteStudenteById(Integer idStudente);
}
